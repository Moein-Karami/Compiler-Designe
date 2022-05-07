package main.visitor.name;

import main.ast.nodes.*;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.*;
import main.compileError.CompileError;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.visitor.*;
import main.symbolTable.utils.graph.Graph;
import main.symbolTable.utils.graph.exceptions.GraphDoesNotContainNodeException;
import main.symbolTable.utils.graph.exceptions.NodeAlreadyExistsException;

import java.util.HashMap;

public class NameAnalyzer extends Visitor<Void> {

    private Graph<String> par_pattern;

    private Program program;

    public NameAnalyzer(Program program){
        this.program = program;
    }

    public void analyze(){
        this.program.accept(new NameCollector());
        this.set_par_pattern();
        this.program.accept(new NameChecker(par_pattern));
    }

    private void set_par_pattern() {
        Graph<String> par_pattern = new Graph<>();
        for (ClassDeclaration cls : this.program.getClasses()){
            String class_name = cls.getClassName().getName();
            try {
                par_pattern.addNode(class_name);
            } catch (NodeAlreadyExistsException err) {}

            if (cls.getParentClassName() == null)
                continue;

            String par_name = cls.getParentClassName().getName();

            try {
                par_pattern.addNodeAsParentOf(class_name, par_name);
                ClassSymbolTableItem parent_item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + par_name, true);
                ClassSymbolTableItem cls_item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + class_name, true);
                cls_item.getClassSymbolTable().pre = parent_item.getClassSymbolTable();
            }catch (ItemNotFoundException | GraphDoesNotContainNodeException err) {}
            this.par_pattern = par_pattern;
        }
    }

    public Graph<String> get_par_pattern() {return par_pattern;}
}