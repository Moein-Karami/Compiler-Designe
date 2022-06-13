.class public Sample
.super java/lang/Object
		 
.field x Ljava/lang/Integer;
.field y Ljava/lang/Integer;
.method public <init>()V
.limit locals 128
.limit stack 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		aload 0
		ldc 0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Sample/x Ljava/lang/Integer;
		aload 0
		ldc 0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Sample/y Ljava/lang/Integer;
		return
.end method
		 
.method public <init>(Ljava/lang/Integer;Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		astore 1
		astore 2
		aload 0
		invokespecial java/lang/Object/<init>()V
		aload 0
		ldc 0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Sample/x Ljava/lang/Integer;
		aload 0
		ldc 0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Sample/y Ljava/lang/Integer;
		aload 0
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		
		dup_x1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Sample/x Ljava/lang/Integer;
		pop
		aload 0
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		
		dup_x1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Sample/y Ljava/lang/Integer;
		pop
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		
		iadd
		invokevirtual java/io/PrintStream/print(I)V
		return
.end method
		 
.method public get_xy_sum()Ljava/lang/Integer;
.limit stack 128
.limit locals 128
		aload 0
		getfield Sample/x Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		aload 0
		getfield Sample/y Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		return
.end method
		 
