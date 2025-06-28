
'''
Given an array of integers, return the indices of two numbers that add up to a target value. You may assume that each input has exactly one solution, and you may not use the same element twice.
'''
def sum_of_target(nums,target):
    seen = {}
    for i, num in enumerate(nums):
        complement = target - num

        if complement in seen:
            return [seen[complement], i]
        seen[num] = i 

li = [1,2,4,5]
target = 5

print(sum_of_target(li,target))