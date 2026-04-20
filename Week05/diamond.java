public class diamond {  
    public static void diamond(int n){  
        String star="*";  
        String dot=".";  
        String space=" ";  
        String temp="";  
        if(n%2==0){  
            System.out.println("The number should be odd.");  
        }  
        else{  
            String[] row= new String[(n+1)/2];  
            for(int i=0;i<(n+1)/2;i++){  
                for(int j=1; j<=2*n-1 ; j++){  
                    if(j%2==0){  
                        temp=temp+space;  
                    }  
                    else{  
                        if(j<n-1-2*i||j>n+2*i){  
                            temp=temp+dot;  
                        }  
                        else{  
                            temp=temp+star;  
                        }  
                    }  
                }  
                row[i]=temp;  
                temp="";  
            }  
            for (int i=0;i<n;i++){  
                if (i<(n+1)/2){  
                    System.out.println(row[i]);  
                }  
                else{  
                    System.out.println(row[n-i-1]);  
                }  
            }  
        }  
    }  
    public static void main(String[] args){  
        // test case 1  
        diamond(5);  
  
        // test case 2  
        diamond(7);  
    }  
}public class diamond {  
    public static void diamond(int n){  
        String star="*";  
        String dot=".";  
        String space=" ";  
        String temp="";  
        if(n%2==0){  
            System.out.println("The number should be odd.");  
        }  
        else{  
            String[] row= new String[(n+1)/2];  
            for(int i=0;i<(n+1)/2;i++){  
                for(int j=1; j<=2*n-1 ; j++){  
                    if(j%2==0){  
                        temp=temp+space;  
                    }  
                    else{  
                        if(j<n-1-2*i||j>n+2*i){  
                            temp=temp+dot;  
                        }  
                        else{  
                            temp=temp+star;  
                        }  
                    }  
                }  
                row[i]=temp;  
                temp="";  
            }  
            for (int i=0;i<n;i++){  
                if (i<(n+1)/2){  
                    System.out.println(row[i]);  
                }  
                else{  
                    System.out.println(row[n-i-1]);  
                }  
            }  
        }  
    }  
    public static void main(String[] args){  
        // test case 1  
        diamond(5);  
  
        // test case 2  
        diamond(7);  
    }  
}
