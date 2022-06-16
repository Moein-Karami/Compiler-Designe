.class public Main
.super java/lang/Object
		 
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Global
		invokespecial Global/<init>()V
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
		aconst_null
		new Array
		dup
		ldc 5
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokespecial Array/<init>(ILjava/lang/Object;)V
		astore 2
		ldc 2
		new Global
		ldc 0
		invokespecial Global/<init>(I)V
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putstatic Global/y Ljava/lang/Integer;
		pop
		aload 2
		astore 6
		ldc 0
		istore 7
		label-new0:
		iload 7
		aload 6
		invokevirtual Array/getSize()I
		isub
		ifeq label-new1
		aload 6
		iload 7
		invokevirtual Array/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		astore 1
		iinc 7 1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		
		new Global
		ldc 0
		invokespecial Global/<init>(I)V
		getstatic Global/y Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		
		dup
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		new Global
		ldc 0
		invokespecial Global/<init>(I)V
		putstatic Global/y Ljava/lang/Integer;
		
		iadd
		invokevirtual java/io/PrintStream/print(I)V
		goto label-new0
		label-new1:
		return
.end method
		 
