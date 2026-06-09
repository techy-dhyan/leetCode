class Solution(object):
    def checkPerfectNumber(self, num):
        if num == 1:
            return False
        sum = 1
        i = 2
        while (i ** 2 <= num):
            if num%i==0:
                sum += i
                sum += num/i
            i+=1
        return sum==num
        
        