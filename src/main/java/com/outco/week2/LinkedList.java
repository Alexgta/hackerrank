package com.outco.week2;


import org.w3c.dom.NodeList;

class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

public class LinkedList {

    public int length = 0;
    public ListNode head;
    public ListNode tail;

    // Time Complexity:
    // Auxiliary Space Complexity:
    public void append(int value) {
        if (this.length == 0) {
            this.head = new ListNode(value);
            this.tail = this.head;
        } else {
            ListNode newNode = new ListNode(value);
            this.tail.next = newNode;
            this.tail = newNode;
        }

        this.length++;
    }


    // Time Complexity:
    // Auxiliary Space Complexity:
    public void insert(int value, int index) {
        if (index < 0 || index > this.length) {

        } else if (this.length == 0) {
            this.head = new ListNode(value);
            this.tail = this.head;
            this.length++;
        } else if (index == 0) {
            ListNode newNode = new ListNode(value);
            newNode.next = this.head;
            this.head = newNode;
            this.length++;
        } else if (this.length == index) {
            ListNode newNode = new ListNode(value);
            this.tail.next = newNode;
            this.tail = newNode;
            this.length++;
        } else if (this.length > index) {
            ListNode newNode = new ListNode(value);
            ListNode preIndex = this.head;
            ListNode afterIndexl = preIndex.next;

            for (int i = 0; i < index; i++) {
                preIndex = afterIndexl;
                afterIndexl = preIndex.next;
            }
            newNode.next = afterIndexl;
            preIndex.next = newNode;
            this.length++;
        }

    }


    // Time Complexity:
    // Auxiliary Space Complexity:
    public void delete(int index){
        if (index < 0 || index > this.length || this.length == 0) {

        } else if (index == 0 && this.length == 1) {
            this.length = 0;
            this.head = null;
            this.tail = null;
        } else if (index == 0) {
            this.length--;
            this.head = this.head.next;
        } else if (this.length > index) {
            ListNode preIndex = head;
            ListNode curIndex = head.next;
            for (int i = 1; i < index; i++) {
                preIndex = curIndex;
                curIndex = curIndex.next;
            }
            preIndex.next = curIndex.next;
            this.length--;

        }
    }


    // Time Complexity:
    // Auxiliary Space Complexity:
    public boolean contains(int value) {
        if (this.length <= 0)
            return false;

        ListNode indexNode = head;
        ListNode nextNode = head.next;
        if (this.head.value == value) {
            return true;
        }
        if (nextNode != null && nextNode.value == value) {
            return true;
        }

        for (int i = 0; i < this.length; i++) {
            nextNode = nextNode.next;
            if (indexNode.value == value)
                return true;
            if (nextNode != null && nextNode.value == value) {
                return true;
            }
        }
        return false;
    }
}


////////////////////////////////////////////////////////////
///////////////  DO NOT TOUCH TEST BELOW!!!  ///////////////
////////////////////////////////////////////////////////////

// use the Main class to run the test cases
class MainLNode {
    private int[] testCount;

    // an interface to perform tests
    public interface Test {
        public boolean execute();
    }

    public static void main(String[] args) {

        int[] testCount = {0, 0};
        System.out.println("ListNode Class");

        assertTest(testCount, "able to create an instance", new Test() {
            public boolean execute() {
                ListNode node = new ListNode(0);
                return node instanceof ListNode;
            }
        });

        assertTest(testCount, "has value field", new Test() {
            public boolean execute() {
                ListNode node = new ListNode(0);
                try {
                    node.getClass().getField("value");
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "able to assign a value upon instantiation", new Test() {
            public boolean execute() {
                ListNode node = new ListNode(5);
                return node.value == 5;
            }
        });

        assertTest(testCount, "able to reassign a value", new Test() {
            public boolean execute() {
                ListNode node = new ListNode(5);
                node.value = 1;
                return node.value == 1;
            }
        });

        assertTest(testCount, "able to point to another node", new Test() {
            public boolean execute() {
                ListNode node1 = new ListNode(5);
                ListNode node2 = new ListNode(10);
                node1.next = node2;
                return node1.next.value == 10;
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("LinkedList Class");

        assertTest(testCount, "able to create an instance", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                return linkedList instanceof LinkedList;
            }
        });

        assertTest(testCount, "has head field", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.getClass().getField("head");
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "has tail field", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.getClass().getField("tail");
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "has length field", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.getClass().getField("length");
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "default head set to null", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                return linkedList.head == null;
            }
        });

        assertTest(testCount, "default tail set to null", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                return linkedList.tail == null;
            }
        });

        assertTest(testCount, "default length set to 0", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                return linkedList.length == 0;
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("LinkedList Insert Method");

        assertTest(testCount, "has insert method", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();

                try {
                    linkedList.getClass().getMethod("insert", new Class[] { int.class, int.class });
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        });

        assertTest(testCount, "able to insert a node into empty linked list", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.insert(5,0);
                    return linkedList.length == 1 && linkedList.head.value == 5 && linkedList.tail.value == 5;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "able to insert a node after another node", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.insert(5,0);
                    linkedList.insert(10, 1);
                    return linkedList.length == 2 && linkedList.head.value == 5 && linkedList.tail.value == 10;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "able to insert a node before another node", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.insert(5,0);
                    linkedList.insert(10,0);
                    return linkedList.length == 2 && linkedList.head.value == 10 && linkedList.tail.value == 5;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "does not insert a node if index is out of bounds linked list", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.insert(5,-1);
                    linkedList.insert(10,3);
                    return linkedList.length == 0 && linkedList.head == null && linkedList.tail == null;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("LinkedList Append Method");

        assertTest(testCount, "has append method", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();

                try {
                    linkedList.getClass().getMethod("append", new Class[] { int.class });
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        });

        assertTest(testCount, "able to append a node into empty linked list", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.append(5);
                    return linkedList.length == 1 && linkedList.head.value == 5 && linkedList.tail.value == 5;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "able to append a second node into a linked list", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.append(5);
                    linkedList.append(10);
                    return linkedList.length == 2 && linkedList.head.value == 5 && linkedList.tail.value == 10;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "able to append a third node into a linked list", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.append(5);
                    linkedList.append(10);
                    linkedList.append(15);
                    return linkedList.length == 3 && linkedList.head.value == 5 && linkedList.tail.value == 15;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("LinkedList Delete Method");

        assertTest(testCount, "has delete method", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();

                try {
                    linkedList.getClass().getMethod("delete", new Class[] { int.class });
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        });

        assertTest(testCount, "able to delete a node from the head", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.append(5);
                    linkedList.append(10);
                    linkedList.delete(0);
                    return linkedList.length == 1 && linkedList.head.value == 10 && linkedList.tail.value == 10;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "able to delete a node in between two nodes", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.append(5);
                    linkedList.append(10);
                    linkedList.append(15);
                    linkedList.delete(1);
                    return linkedList.length == 2 && linkedList.head.value == 5 && linkedList.tail.value == 15;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "able to delete the only node in a linked list", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.append(5);
                    linkedList.delete(0);
                    return linkedList.length == 0 && linkedList.head == null && linkedList.tail == null;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "does not delete a node when the index is out of bounds", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.append(5);
                    linkedList.delete(-1);
                    linkedList.delete(2);
                    return linkedList.length == 1 && linkedList.head.value == 5 && linkedList.tail.value == 5;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


        testCount[0] = 0;
        testCount[1] = 0;
        System.out.println("LinkedList Contains Method");

        assertTest(testCount, "has contains method", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();

                try {
                    linkedList.getClass().getMethod("contains", new Class[] { int.class });
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        });

        assertTest(testCount, "returns true if linked list contains value", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.append(5);
                    linkedList.append(10);
                    linkedList.append(15);
                    return linkedList.contains(15);
                } catch (Exception e) {
                    return false;
                }
            }
        });

        assertTest(testCount, "returns false if linked list does not contains value", new Test() {
            public boolean execute() {
                LinkedList linkedList = new LinkedList();
                try {
                    linkedList.append(5);
                    linkedList.append(10);
                    linkedList.append(15);
                    return linkedList.contains(8) == false;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");

    }

    private static void assertTest(int[] count, String name, Test test) {
        String pass = "false";
        count[1]++;

        try {
            if (test.execute()) {
                pass = " true";
                count[0]++;
            }
        } catch(Exception e) {}
        String result = "  " + (count[1] + ")   ").substring(0, 5) + pass + " : " + name;
        System.out.println(result);
    }
}
