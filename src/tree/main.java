package tree;

import myQueue.SimpleStack;

public class main {
    public static void main(String[] args) {
        Tree root = new Tree(20, new Tree(7, new Tree(4, null, new Tree(6)), new Tree(9)),
                new Tree(35, new Tree(31, new Tree(28), null), new Tree(40, new Tree(38), new Tree(52))));
//        System.out.println(root.sum());
        System.out.println(sumDeep(root));
    }
    public static int sumDeep(Tree root){
        SimleStackMy<Tree> arr = new SimleStackMy<>();
        arr.push(root);
        int sum = 0;
        while (!arr.isEmpty()){
            Tree node = arr.pop();
            sum += node.value;
            if(node.right != null){
                arr.push(node.right);
            }
            if(node.left!= null){
                arr.push(node.left);
            }
        }
        return sum;
    }
}
class Tree{
    int value;
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
    }
    public int sum(){
        int sum = value;
        if(left != null){
            sum+= left.sum();
        }
        if(right != null){
            sum+=right.sum();
        }
        return sum;
    }
}