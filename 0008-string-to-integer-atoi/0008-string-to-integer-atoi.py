class Solution:
    def myAtoi(self, s: str) -> int:
        s=s.strip()
        i=0
        sign=1
        if len(s)==0: return 0
        if s[i]== '+':
            sign=1
            i+=1
        elif s[i] == '-':
            sign=-1
            i+=1
        INT_MIN = -2**31
        INT_MAX = 2**31 - 1

        def helper(str,i,num,sign):
            if i >= len(s) or not s[i].isdigit():
                return sign * num

    # Update num
            num = num * 10 + int(s[i])

    # Clamp if overflow
            if sign * num <= INT_MIN: return INT_MIN
            if sign * num >= INT_MAX: return INT_MAX

            # Recurse
            return helper(s, i + 1, num, sign)

        return helper(str,i,0,sign)
