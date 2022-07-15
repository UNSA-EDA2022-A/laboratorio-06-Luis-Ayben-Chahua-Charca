package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){

        return nodeEstricto(a.root);
    }

    public boolean nodeEstricto(Node n1){

        //si es binario, comprueba que los descendientes lo sean, en caso no sean nulos.
        if(binario(n1)){
            if (n1.left!=null&&n1.right!=null){
                return nodeEstricto(n1.left) && nodeEstricto(n1.right);
            }
            if(n1.left==null&&n1.right==null){
                return true;
            }
            return false;
            
        } 
        return false;
        
 
    }

    //funcion que comprueba que el nodo cumpla las condiciones.
    public boolean binario(Node a){
        if(a!=null){
            if(a.left==null&&a.right==null){
                return true;
            }
            if (a.left!=null&&a.right!=null){
                return true;
            }
            return false;
        }
        return true;
    }

    
}
