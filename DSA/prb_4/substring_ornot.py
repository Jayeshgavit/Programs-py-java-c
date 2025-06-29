

def substr(sub,main):
    if sub in main: 
        return f"String Found!!" 
    else:
        return f"String not found!!"
    
main = " Welcome to java tutorial"
sub = "java"
rs = substr(sub,main)
print(rs)