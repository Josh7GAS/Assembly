#include <iostream>
#include <netinet/in.h>
#include <stdio.h>
#include <string.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netdb.h>
#include <arpa/inet.h>

struct in_addr {
	in_addr_t s_addr;

};

struct sockaddr_in{

	uint8_t sin_len; //length of structure(16)
	sa_family_t sin_family; //AF_INET
	in_port_t sin_port;//16-bit TCP or UPD port number

	struct in_addr; //32-bit IPv4 address
			//network byte ordered
	
	char sin_zero[8];//unsed
};


