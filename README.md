# Common Code Segment Selector

**Common** **code** **segment** **selector** \(C2S2\) is a independent tool to select common code segments for exclusion from code similarity detection. It accepts a set of programs and lists the common segments. The segments are subject to manual investigation before being excluded from similarity detection. If the similarity detection does not accommodate such exclusion, but can deal with uncompilable code, C2S2 can remove the common segments from student submissions.
Further details can be seen in the corresponding paper (updated later). Currently, the tool covers two programming languages: Java and Python. 

## C2S2 Modes 
### select


## Acknowledgments
This tool uses [ANTLR](https://www.antlr.org/) to tokenise given programs.
