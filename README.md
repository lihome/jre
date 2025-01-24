# 说明

## 目的

本项目主要是保留rt.jar中class的调试信息，对于编译报错的非常用类，直接丢弃即可
因为是将jdk下的src.zip中编译的class追加到rt.jar（不求全部）

由于sun.awt.UNIXToolkit在macos的rt.jar中不存在，目前版本已知无法编译通过的文件：
- com.sun.java.swing.plaf.gtk.GTKEngine
- com.sun.java.swing.plaf.gtk.GTKLookAndFeel
- com.sun.java.swing.plaf.gtk.GTKPainter
- com.sun.java.swing.plaf.gtk.GTKStyle
- com.sun.java.swing.plaf.gtk.GTKGraphicsUtils
- com.sun.java.swing.plaf.gtk.GTKIconFactory
- com.sun.java.swing.plaf.gtk.GTKStyleFactory
- com.sun.java.swing.plaf.gtk.Metacity


## 追加方法：

0. 将`jre`本项目使用`eclipse`的`maven`方式导入

1. 将`jre/lib/rt.jar`复制到 项目的 `target/classes`下
> jar -uf rt.jar com java javax org

2. 备份`jre/lib/rt.jar`，然后拿新的`rt.jar`放到原位置
