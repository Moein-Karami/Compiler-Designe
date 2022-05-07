package main.compileError.nameError;

import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.compileError.CompileError;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.items.ClassSymbolTableItem;

public class ClassRedefinition extends CompileError {
    public ClassRedefinition(int line, String className) {
        super(line, "Redefinition of class " + className);
    }

    public void handle_error(ClassDeclaration cls){
        String unique_name = cls.getClassName().getName() + '$';
        cls.getClassName().setName(unique_name);
        ClassSymbolTableItem cls_item = new ClassSymbolTableItem(cls);
        cls_item.setClassSymbolTable(SymbolTable.top);
        try{
            SymbolTable.root.put(cls_item);
        } catch (ItemAlreadyExistsException err) {
            this.handle_error(cls);
        }
        return null;
    }
}
