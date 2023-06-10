
  static Node flatten(Node root) {
    // your code here
	  if(root.right == null)
		  return root;

	  Node t = flatten(root.right);
	  Node mHead = merge(root, t);
	  return mHead;
  }
	static Node merge(Node h1, Node h2){
		Node ans = new Node(-1);
		Node l = ans;
		Node t1 = h1;
		Node t2 = h2;
		t1.right = null;
		while(t1 != null && t2 != null)
			{
				if(t1.data < t2.data)
				{
					l.down = t1;
					l = l.down;
					t1 = t1.down;
				}
				else
				{
					l.down = t2;
					l = l.down;
					t2 = t2.down;
				}
			}
		if(t1 != null){
			l.down = t1;
		}
		if(t2 != null){
			l.down = t2;
		}
		return ans.down;
	}