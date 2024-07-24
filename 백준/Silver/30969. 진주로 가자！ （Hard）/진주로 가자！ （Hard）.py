import sys
input = sys.stdin.readline

N = int(input())

costList = [0] * 1001
jinCost = 0

cnt = 0

for i in range(N) : 
    region, cost = map(str, input().split())
    cost = int(cost)
    if region == 'jinju' : 
        jinCost = cost
    elif cost > 1000 : 
        cnt += 1
    else : 
        costList[cost] += 1

for i in range(jinCost+1, 1001) : 
    cnt += costList[i]
    
print(jinCost)
print(cnt)