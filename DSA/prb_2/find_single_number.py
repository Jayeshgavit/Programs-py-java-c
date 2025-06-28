'''
Given an array of integers, every element appears twice except for one. Find that single one.
'''

def find_single_element(nums):
    freq = {}

    for num in nums:
        freq[num] = freq.get(num,0)+1

    for key in freq:
        if freq[key] ==1:
            return key


result = find_single_element([2,4,5,2,5])
print(result)