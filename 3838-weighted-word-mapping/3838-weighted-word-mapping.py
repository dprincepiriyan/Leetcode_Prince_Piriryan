class Solution:
    def mapWordWeights(self, words: List[str], weights: List[int]) -> str:
        res=[]
        for word in words:
            total_weight=sum(weights[ord(char)-ord('a')] for char in word)
            mapped_val=total_weight%26
            res.append(chr(ord('z')-mapped_val))
        return "".join(res)