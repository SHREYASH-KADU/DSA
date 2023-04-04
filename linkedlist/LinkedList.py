class Node:
    def __init__(self,d):
        self.data = d
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None
    
    def insert(self,d):
        n = Node(d)
        n.next = None
        if(self.head==None):
            self.head = n
        else:
            p = self.head
            while(p.next!=None):
                p = p.next
            p.next = n
    
    def printll(self):
        p = self.head
        while(p!=None):
            print(p.data)
            p = p.next

def main():
    list = LinkedList()
    list.insert(1)
    list.insert(2)
    list.insert(3)
    list.insert(4)
    list.printll()
    
if __name__=='__main__':
    main()