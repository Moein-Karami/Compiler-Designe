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
		aconst_null
		new Array
		dup
		ldc 5
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokespecial Array/<init>(ILjava/lang/Object;)V
		astore 1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		ldc 2
		invokevirtual Array/getElement(I)Ljava/lang/Object;
		checkcast 
		ldc 1
		invokevirtual Array/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/print(I)V
		return
.end method
		 
