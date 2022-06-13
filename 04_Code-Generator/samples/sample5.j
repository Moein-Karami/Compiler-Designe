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
return
.end method

