class Solution(object):
    def isNumber(self, s):
        s = s.strip()

        if s.lower() in {"inf", "+inf", "-inf",
                         "infinity", "+infinity", "-infinity",
                         "nan", "+nan", "-nan"}:
            return False
        try:
            float(s)
            return True
        except:
            return False