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
		astore 1
		new Shit
		dup
		invokespecial Shit/<init>()V
		dup
		astore 1
		pop
		aload 1

		ldc 3

		dup_x1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Shit/t Ljava/lang/Integer;
		pop
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1

		getfield Shit/t Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/print(I)V
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
		 
