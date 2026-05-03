The Fast & Slow Pointer technique uses two pointers moving at different speeds
(slow = 1 step, fast = 2 steps) to solve problems in O(n) time and O(1) space.

When to Use This Pattern
Cycle detection
Finding middle element
Duplicate detection
Palindrome linked list
Repeating states
1. Linked List Cycle Detection
🔗 https://leetcode.com/problems/linked-list-cycle/

1 → 2 → 3 → 4 → 5
          ↑     ↓
          ← ← ← ←
slow: 1 step
fast: 2 steps

Eventually:
slow == fast → cycle exists

Code

function hasCycle(head: ListNode | null): boolean {
    let slow = head;
    let fast = head;

    while (fast && fast.next) {
        slow = slow!.next;
        fast = fast.next.next;
        if (slow === fast) return true;
    }
    return false;
}



2. Find Start of Cycle
🔗 https://leetcode.com/problems/linked-list-cycle-ii/

Head → A → B → C → D → E
              ↑         ↓
              ← ← ← ← ←
Step 1: slow & fast meet inside cycle
Step 2: move slow to head
Step 3: move both 1 step
Meeting point = cycle start

function detectCycle(head: ListNode | null): ListNode | null {
    let slow = head;
    let fast = head;

    while (fast && fast.next) {
        slow = slow!.next;
        fast = fast.next.next;
        if (slow === fast) break;
    }

    if (!fast || !fast.next) return null;

    slow = head;
    while (slow !== fast) {
        slow = slow!.next;
        fast = fast!.next;
    }
    return slow;
}





3. Middle of Linked List
🔗 https://leetcode.com/problems/middle-of-the-linked-list/

1 → 2 → 3 → 4 → 5 → 6
s       ↑
f               ↑
fast moves 2x
slow stops at middle

function middleNode(head: ListNode | null): ListNode | null {
    let slow = head;
    let fast = head;

    while (fast && fast.next) {
        slow = slow!.next;
        fast = fast.next.next;
    }
    return slow;
}



4. Palindrome Linked List
🔗 https://leetcode.com/problems/palindrome-linked-list/

Original:
1 → 2 → 3 → 2 → 1

After middle & reverse:
Left:  1 → 2 → 3
Right: 1 → 2
Compare both halves


function isPalindrome(head: ListNode | null): boolean {
    let slow = head;
    let fast = head;

    while (fast && fast.next) {
        slow = slow!.next;
        fast = fast.next.next;
    }

    let prev = null;
    while (slow) {
        const next = slow.next;
        slow.next = prev;
        prev = slow;
        slow = next;
    }

    let left = head;
    let right = prev;
    while (right) {
        if (left!.val !== right.val) return false;
        left = left!.next;
        right = right.next;
    }
    return true;
}



5. Happy Number
🔗 https://leetcode.com/problems/happy-number/

19 → 82 → 68 → 100 → 1 (happy)

OR

4 → 16 → 37 → 58
    ↑           ↓
    ← ← ← ← ← ←
Cycle detected


function isHappy(n: number): boolean {
    const next = (num: number) => {
        let sum = 0;
        while (num > 0) {
            const d = num % 10;
            sum += d * d;
            num = Math.floor(num / 10);
        }
        return sum;
    };

    let slow = n;
    let fast = next(n);

    while (fast !== 1 && slow !== fast) {
        slow = next(slow);
        fast = next(next(fast));
    }
    return fast === 1;
}



6. Find the Duplicate Number
🔗 https://leetcode.com/problems/find-the-duplicate-number/

Index:  0  1  2  3  4
Value:  1  3  4  2  2

0 → 1 → 3 → 2 → 4
          ↑     ↓
          ← ← ← ←
Duplicate creates cycle


function findDuplicate(nums: number[]): number {
    let slow = nums[0];
    let fast = nums[0];

    do {
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while (slow !== fast);

    slow = nums[0];
    while (slow !== fast) {
        slow = nums[slow];
        fast = nums[fast];
    }
    return slow;
}
**Think: “Can this form a cycle?”

Fast pointer always catches slow in a loop

O(1) space, O(n) time**
