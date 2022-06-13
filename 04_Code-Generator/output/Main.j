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
		new Array
		dup
		ldc 2
		invokespecial Array/<init>(ILjava/lang/Object;)V
		astore 1
		return
.end method
		 
