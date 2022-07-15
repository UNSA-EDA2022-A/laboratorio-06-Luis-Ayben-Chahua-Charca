package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){

        return nodeSimilares(a1.root, a2.root);
    }
    //nueva clase que permite recursividad usando nodos.
    public boolean nodeSimilares (Node n1, Node n2){
        //comprueba que los nodos comparado sean iguales, ya sean nulos, o tengan valor
        if (n1==null||n2==null){
            if(n1 == n2){
                return true;
            }
            return false;
        }

        if (n1!=null&&n2!=null){
            // se llama de nuevo la funcion para ambos nodos , una vez se comprueba que se cumple la condicion
            return nodeSimilares(n1.left, n2.left) && nodeSimilares(n1.right, n2.right);
            
        }

        return false;
       
    }

}
