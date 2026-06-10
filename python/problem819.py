class Solution(object):
    def mostCommonWord(self, paragraph, banned):
        paragraph = "".join(char if char.isalnum() else " " for char in paragraph)
        print(paragraph)
        l = paragraph.lower().split()
        print(l)
        l = [word for word in l if word not in banned]
        print(l)
        return max(l,key = l.count)