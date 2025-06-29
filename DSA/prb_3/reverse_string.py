'''
Given a string `s`, return the reversed string.

Example:
Input: "hello"
Output: "olleh"

'''

# Approch- slicing
def  reverse_string(str):
    return str[::-1]

result = reverse_string("hello")
print(result)

#Approch-2
def reverse_str(str1):
    rs_string = "";

    for ch in str1:
        rs_string = ch + rs_string

    return rs_string

result = reverse_str("HELLO")
print(result) 