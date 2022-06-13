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
		aload 1
		pop
		aload 1
		ldc 3
		dup_x1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Shit/t Ljava/lang/Integer;
		aload 1
		getfield Shit/t Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		pop
		return
.end method