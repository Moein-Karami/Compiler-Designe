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
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc 2
		
		ldc 2
		
		imul
		ldc 3
		
		iadd
		invokevirtual java/io/PrintStream/print(I)V
		return
.end method
		 
