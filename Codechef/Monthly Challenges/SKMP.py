from copy import deepcopy

for _ in range(int(input())):
    s = list(input())
    p = list(input())
    
    for i in p:
        s.remove(i)
    s.sort()
    ne = deepcopy(s)
    ne.append(p[0])
    ne=sorted(ne,reverse=True)
    print(ne)
    if p[0] not in s:
        print(''.join(s[0:len(ne) - ne.index(p[0])-1])+''.join(p)+''.join(s[len(ne)-ne.index(p[0])-1:]))
    else:
        air = ''.join(s[0:s.index(p[0])])+''.join(p)+''.join(s[s.index(p[0]):])
        print('air: ',air)
      #  print('min :',''.join(s[0:len(ne)-ne.index(p[0])-1])+''.join(p)+''.join(s[len(ne)-ne.index(p[0])-1:]))
        print(min(air,''.join(s[0:len(ne)-ne.index(p[0])-1])+''.join(p)+''.join(s[len(ne)-ne.index(p[0])-1:])))