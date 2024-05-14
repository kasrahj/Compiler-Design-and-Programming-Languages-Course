.class public Main
.super java/lang/Object
.method static calculate()I
.limit stack 128
.limit locals 128
		bipush 20
		istore_1
		iconst_4
		istore_2
		iconst_0
		istore_3
		iconst_3
		iload_1
		iload_2
		idiv
		iadd
		istore_3
		iload_3
		ireturn
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		invokestatic Main/calculate()I
		istore_1
		bipush 16
		iconst_2
		idiv
		iconst_1
		iadd
		istore_2
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload_1
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload_2
		invokevirtual java/io/PrintStream/println(I)V
		return
.end method
