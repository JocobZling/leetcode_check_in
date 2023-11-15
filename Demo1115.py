class Solution:
    def maximizeSum(self, nums: List[int], k: int) -> int:
            return int(k*(max(nums)+max(nums)+k-1)/2)