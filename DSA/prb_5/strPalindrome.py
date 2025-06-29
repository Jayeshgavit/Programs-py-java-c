# Check if a String is a Palindrome

def isPalindrome(str):
    rev = str[::-1]

    if str == rev:
        return f"'{str}' is palindrome..!"
    else:
        return f"{str} is not palindrome..!!"


result = isPalindrome("madam")
print(result)