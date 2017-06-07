# Lucene实战

## 索引过程的核心类
* Index Writer
* Directory
* Analyzer
* Document
* Field

## 搜索过程的核心类
* IndexSearcher
* Term
* Query
* TermQuery
* TopDocs

### 文档和域
文档是Lucene索引和搜索的原子单位。文档包含一个活多个域的容器，而域则依次包含“真正的”被搜索的内容

### 段
Lucene 索引都包含一个或多个段，每个段都是一个独立的索引，它包含整个文档的一个子集。每当writer摔性能缓冲区增加的文档，以及挂机目录操作时，索引文件都会建立一个新段。
在搜索索引时，每个段都是单独访问的。但搜索结果是合并后返回。
当程序开关writer比较频繁时，IndexWriter会周期性选择一些段，合并到新段并删除老的段。