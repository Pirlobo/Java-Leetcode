# With Duc Tan Hoang, Dung Vuong
# References
#https://medium.com/geekculture/euclidean-algorithm-using-python-dc7785bb674a
def EEA(a, b):
  if b == 0:
    gcd, s, t = a, 1, 0
    return gcd, s, t
  else:
    s2, t2, s1, t1 = 1, 0, 0, 1
    while b > 0:
      q= a // b
      r, s, t = (a - b * q),(s2 - q * s1),( t2 - q * t1)
      a,b,s2,t2,s1,t1=b,r,s1,t1,s,t
    gcd,s,t=a,s2,t2
    return gcd,s,t

print()
p = int(input("Enter p: "))
q = int(input("Enter q: "))
e = int(input("Enter e: "))

phi = (p-1) * (q-1)

g, x, y = EEA(phi, e)
print()
print("phi_n = (p-1) * (q-1) =", phi)
print("gcd(", phi , "," , e, ") = ", g)
print("x =", x , ", y =" , y)
if y > phi:
    print("Smallest possible d:", y % phi)
elif y < 0:
    print("Smallest possible d:", y + phi)
print()