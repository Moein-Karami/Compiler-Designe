.class public Main
.super java/lang/Object
		 
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
.method public <init>()V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		ldc 1
		ldc 3
		invokevirtual <init>(II)V
		astore 3
		ldc 0
		istore 4
		label-new0:
		iload 4
		astore 3
		invokevirtual getSize()I
		isub
		ifeq label-new1
		iload 4
		aload 3
		invokevirtual getElement(I)Ljava/lang/Object;
		astore 1
		iinc 4 1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/print(I)V
		goto label-new0
		label-new1:
		return
.end method
		 
