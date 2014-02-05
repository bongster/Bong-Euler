object pro1{
    def main(args: Array[String]){
        var result = (1 to 1000).filter(p => (p % 3 ==0) || (p % 5 ==0)).sum 
        println(result);
    }
}
