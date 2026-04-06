def calculate (a,b):
    sum_result=a+b
    diff_result=a-b
    prod_result=a*b
    return sum_result,diff_result,prod_result
a=int(input("enter the value :"))
b=int(input("enter the another value :"))
x,y,z=calculate(a,b)
print("Sum:{x},Difference:{y},Product{z}") 
