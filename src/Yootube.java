import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Yootube {

	// determining the position of nodes
	static int position = 0;

	// for stacking yootube lists
	static Stack<DoublyLinkedList> stackOfLists = new Stack<>();

	public static void main(String[] args) throws Exception {

		DoublyLinkedList allVideos = new DoublyLinkedList("all Videos");

		DoublyLinkedList history = new DoublyLinkedList("History");

		DoublyLinkedList favourites = new DoublyLinkedList("favourites");

		DoublyLinkedList watchLater = new DoublyLinkedList("watch later");

		Node n10 = new Node(1999, "Brave wilderness", "user10", "documentaries", "JKEVJKJNM<%$%@/", 1004, 0);

		Node n11 = new Node(2000, "Wild life", "user11", "documentaries", "IWFIWOWIE*#*@#/", 3002, 0);

		Node n12 = new Node(2040, "Lions", "user12", "documentaries", "OSDFWOFIWEEFO#(*$@#", 2849, 0);

		Node n13 = new Node(2044, "In wonder", "user 13", "documentaries", "GWOKKWGOWKGO@#)$()", 1983, 1);

		Node n14 = new Node(2060, "Miss Americana", "user14", "documentaries", "WODKDWOFKW)@#$(@", 2939, 0);

		Node n15 = new Node(2063, "24 hours with Katy perry", "user15", "documentaries", "DKOFWDKO@#$()##@%@VSD", 9583,
				0);

		Node n16 = new Node(2065, "The lion kingdom", "user16", "documentaries", "SFOW!@#)_!%#@@WXSAdsv", 6403, 0);

		Node n17 = new Node(2360, "Life with Mac", "user17", "documentaries", "SKOSCKSDOKREOKSD#@)@", 3091, 0);

		Node n18 = new Node(2550, "Save the world in 40 minutes", "user18", "documentaries", "SCOSKDSKDO(@)#@(EWDKASC",
				2911, 0);

		Node n19 = new Node(2555, "99 percent", "user19", "documentaries", "WDCKSD#(ECD#$(**&&^/", 9823, 0);

		Node n35 = new Node(4600, "The dark knight", "user 35", "Movies", "BKMDFCSDM#@(@234232/", 2095, 0);

		Node n36 = new Node(4666, "Black widow", "user36", "Movies", "SDVSDSOF)#$@", 8383, 0);

		Node n37 = new Node(4700, "Riverdale", "user37", "Movies", "SSDGYJFDSE$%^#", 9090, 0);

		Node n38 = new Node(4790, "Nikita", "user 38", "Movies", "JGVSETYTF", 6833, 0);

		Node n39 = new Node(4800, "Racing cars", "user39", "Movies", "IUYTRDCIUYTFRD&^%$#", 6272, 0);

		Node n40 = new Node(5000, "Last of us", "user40", "Movies", "EFKBOVEKFE12/*&^%", 7375, 0);

		Node n1 = new Node(1000, "Nansi ajram- sh5bt", "Nansi", "songs", "RIHTOEGRFWEIOR#$()@", 1000, 0);

		Node n2 = new Node(1050, "Nansi ajram- albi", "Nansi", "songs", "JIWVDJDJFSJIJEWFI#*($@(#*", 1103, 0);

		Node n3 = new Node(1080, "Nansi ajram- ma teje", "Nansi", "songs", "WJIDFJWIJ@(#$", 1165, 0);

		Node n4 = new Node(1090, "George wasouf-Alb el3ashe2", "George", "songs", "JVWDSKCJMSDA#@)($", 2907, 0);

		Node n5 = new Node(1150, "George wasouf- 7lf el2mar", "George", "songs", "WGEJFKSMDA@#)$(", 2139, 0);

		Node n6 = new Node(1160, "George wasouf- ru7e ya nsma", "George", "songs", "IKYUJTHGRFD&%^$", 3404, 0);

		Node n7 = new Node(1190, "Asi Helane- b7bk w b8ar", "Asi", "songs", "KYUJTHRGFSD%^$", 2206, 0);

		Node n8 = new Node(1191, "Asi Helane- bab bbki", "Asi", "songs", "KYUJTYHRTG^&%$", 4000, 1);

		Node n9 = new Node(1195, "Asi Helane- ya ter", "Asi", "songs", "KYJTHGFDV^&%", 2130, 0);

		Node n31 = new Node(4040, "The Nun", "NUN", "Films", "LIKJYHGFDC%^$#", 1130, 0);

		Node n32 = new Node(4444, "Fast&Furious", "Ven Dizel", "Films", "JHGFCS^%$#", 1023, 1);

		Node n33 = new Node(4455, "Monster House", "Film Zone", "Fims", "UJTGFEDS^%$#", 1011, 0);

		Node n34 = new Node(4500, "A christmas carol", "cartoon for all", "Films", "UMJYNHTCSX&^%$#", 1191, 0);

		Node n20 = new Node(2600, "fortnite", "ahmad", "games", "OKJHGFDSAWERTY&^%$#@", 1009, 0);

		Node n21 = new Node(3330, "GTA", "Jack", "games", "IUJYHTGRFEDS^%$#@", 2009, 1);

		Node n22 = new Node(3455, "Call of Duty", "George", "games", "KUJYHTGRFEDC^%$#@", 1507, 0);
		Node n23 = new Node(3452, "Need for speed", "Jeries", "games", "KUJYHTGRFD^&%$#", 2405, 1);

		Node n24 = new Node(3555, "Minecraft", "Larry", "games", "WERTYUKJHGF^%$", 3000, 0);

		Node n25 = new Node(3590, "Among US", "Fadi", "games", "WERTYHJHGFCDS&^%$#", 2700, 0);

		Node n26 = new Node(3592, "Battlefield4", "Mohammed", "battle4.games", "KJHGFDSERTY&^%$", 2800, 0);

		Node n27 = new Node(3595, "Battlefield1", "Mark", "games", "MNBGVFCDXSDRFTGYHJ&^%$#", 2606, 0);

		Node n28 = new Node(3600, "Rocket League", "Ali", "games", "UKJYHGFDS^%$#", 1704, 0);

		Node n29 = new Node(3700, "The Last of US", "Anton", "games", "KJHGFDSAUYTR^%$#@", 3705, 0);

		Node n30 = new Node(3801, "FIFA 21", "Alex", "games", "YTGFEDS^&%$#", 1807, 0);

		allVideos.addFirst(n40);

		allVideos.addFirst(n39);

		allVideos.addFirst(n38);

		allVideos.addFirst(n37);

		allVideos.addFirst(n36);

		allVideos.addFirst(n35);

		allVideos.addFirst(n34);

		allVideos.addFirst(n33);

		allVideos.addFirst(n32);

		allVideos.addFirst(n31);

		allVideos.addFirst(n30);

		allVideos.addFirst(n29);

		allVideos.addFirst(n28);

		allVideos.addFirst(n27);

		allVideos.addFirst(n26);

		allVideos.addFirst(n25);

		allVideos.addFirst(n24);

		allVideos.addFirst(n23);

		allVideos.addFirst(n22);

		allVideos.addFirst(n21);

		allVideos.addFirst(n20);

		allVideos.addFirst(n19);

		allVideos.addFirst(n18);

		allVideos.addFirst(n17);

		allVideos.addFirst(n16);

		allVideos.addFirst(n15);

		allVideos.addFirst(n14);

		allVideos.addFirst(n13);

		allVideos.addFirst(n12);

		allVideos.addFirst(n11);

		allVideos.addFirst(n10);

		allVideos.addFirst(n9);

		allVideos.addFirst(n8);

		allVideos.addFirst(n7);

		allVideos.addFirst(n6);

		allVideos.addFirst(n5);

		allVideos.addFirst(n4);

		allVideos.addFirst(n3);

		allVideos.addFirst(n2);

		allVideos.addFirst(n1);

		stackOfLists.push(history);

		stackOfLists.push(watchLater);

		stackOfLists.push(favourites);

		// dummy data copies of nodes are added to default lists

		favourites.addFirst(new Node(n18.ID, n18.title, n18.user, n18.category, n18.URL, n18.sizeMega, n18.hits));
		favourites.addFirst(new Node(n27.ID, n27.title, n27.user, n27.category, n27.URL, n27.sizeMega, n27.hits));
		favourites.addFirst(new Node(n5.ID, n5.title, n5.user, n5.category, n5.URL, n5.sizeMega, n5.hits));
		favourites.addFirst(new Node(n30.ID, n30.title, n30.user, n30.category, n30.URL, n30.sizeMega, n30.hits));
		favourites.addFirst(new Node(n26.ID, n26.title, n26.user, n26.category, n26.URL, n26.sizeMega, n26.hits));

		watchLater.addFirst(new Node(n17.ID, n17.title, n17.user, n17.category, n17.URL, n17.sizeMega, n17.hits));
		watchLater.addFirst(new Node(n32.ID, n32.title, n32.user, n32.category, n32.URL, n32.sizeMega, n32.hits));
		watchLater.addFirst(new Node(n37.ID, n37.title, n37.user, n37.category, n37.URL, n37.sizeMega, n37.hits));
		watchLater.addFirst(new Node(n28.ID, n28.title, n28.user, n28.category, n28.URL, n28.sizeMega, n28.hits));
		watchLater.addFirst(new Node(n10.ID, n10.title, n10.user, n10.category, n10.URL, n10.sizeMega, n10.hits));

		history.addFirst(new Node(n32.ID, n32.title, n32.user, n32.category, n32.URL, n32.sizeMega, n32.hits));
		history.addFirst(new Node(n13.ID, n13.title, n13.user, n13.category, n13.URL, n13.sizeMega, n13.hits));
		history.addFirst(new Node(n23.ID, n23.title, n23.user, n23.category, n23.URL, n23.sizeMega, n23.hits));
		history.addFirst(new Node(n8.ID, n8.title, n8.user, n8.category, n8.URL, n8.sizeMega, n8.hits));
		history.addFirst(new Node(n21.ID, n21.title, n21.user, n21.category, n21.URL, n21.sizeMega, n21.hits));

		boolean b = true; // boolean for the loop to keep running.

		while (b == true) {

			// returning position to 0 every time the list is printed
			position = 0;

			printRecursively(allVideos.searchForNode(1));

			System.out.print("         * WELCOME! *\n " + "\n1.Add a video to a List\n2.Watch a video "
					+ "\n3.Create a list " + "\n4.Get information of a video by position" + "\n5.shuffle a list"
					+ "\n6.play in order" + "\n7.Clear a list" + "\n8.Show recommended" + "\n9.print  list"
					+ "\n10.Get information of a video by searching for ID" + "\n11.Remove a video from a list"
					+ "\n12.Move a video from a list to another list"
					+ "\n13.Move a video from position to position in the same list" + "\n14.Exit YooTube" + "\n"
					+ "\n What would you like to do? ");

			Scanner sc = new Scanner(System.in);

			try {

				int input = sc.nextInt();

				// user must choose from menu
				if (input < 1 || input > 14) {

					throw new IndexOutOfBoundsException();

				}

				else {

					if (input == 1) {

						System.out.println("Which video would you like to add and to what list?");

						System.out.print("Number of video: ");

						int num = sc.nextInt();

						System.out.println("List:");

						printStack(stackOfLists);

						System.out.print("Enter number of list: ");

						int list = sc.nextInt();

						if (--list == 0) {

							System.out.println("you can't move the node to the history list");

							Thread.sleep(3000);
						} else if (list < 1 || list > stackOfLists.size())
							throw new IndexOutOfBoundsException();
						else {

							stackOfLists.elementAt(list)
									.addFirst(new Node(allVideos.searchForNode(num).ID,
											allVideos.searchForNode(num).title, allVideos.searchForNode(num).user,
											allVideos.searchForNode(num).category, allVideos.searchForNode(num).URL,
											allVideos.searchForNode(num).sizeMega, allVideos.searchForNode(num).hits));

							System.out.println();

							System.out.println("Video is added here is the " + stackOfLists.elementAt(list).nameOfList
									+ " list:\n");

							stackOfLists.elementAt(list).printList();

							System.out.println();

							// 10 seconds for user to scan contents of list.
							Thread.sleep(10000);

						}

					}

					else if (input == 2) {

						System.out.println("What video would you like to watch??");

						System.out.print("Enter Number of Video: ");

						int inputVideo = sc.nextInt();

						if (inputVideo < 1 || inputVideo > allVideos.size)
							throw new IndexOutOfBoundsException();

						else {

							System.out.println();

							allVideos.watchVideoAccordingToPosition(inputVideo);

							history.addFirst(new Node(allVideos.searchForNode(inputVideo).ID,
									allVideos.searchForNode(inputVideo).title, allVideos.searchForNode(inputVideo).user,
									allVideos.searchForNode(inputVideo).category,
									allVideos.searchForNode(inputVideo).URL,
									allVideos.searchForNode(inputVideo).sizeMega,
									allVideos.searchForNode(inputVideo).hits));

						}

					}

					else if (input == 3) {

						// 4th list can be created before user's list.
						if (stackOfLists.elementAt(3).nameOfList == "Your List") {
							System.out.println("The user can only create up to one list");
						}

						// maximum of 5 lists can exist
						else if (stackOfLists.size() >= 5) {
							System.out.println("The user can only create up to one list");
						}

						else {

							stackOfLists.push(createAList());

							System.out.println("List have been created");

							System.out.println("Here are the lists");

							printStack(stackOfLists);

							Thread.sleep(5000);

						}

					}

					else if (input == 4) {

						System.out.print("Enter the number of video to get its information: ");

						int numVideo = sc.nextInt();

						if (numVideo < 1 || numVideo > allVideos.size)
							throw new IndexOutOfBoundsException();

						else {
							allVideos.getInformationOfAVideoAccordingToPosition(numVideo);
						}

						Thread.sleep(8000);

					}

					else if (input == 5) {

						System.out.println("Lists:");

						printStack(stackOfLists);

						System.out.println(
								"Which list do you want to shuffle and for how long do you want it to keep shuffling?");

						System.out.println("num of list: ");

						int numList = sc.nextInt();

						if (numList == 1) {

							System.out.println("The history list can't be shuffled");

							Thread.sleep(3000);
						}

						else {

							if (numList < 1 || numList > stackOfLists.size())
								throw new IndexOutOfBoundsException();

							System.out.println("Time: ");

							int time = sc.nextInt();

							if (stackOfLists.elementAt(numList).header == stackOfLists.elementAt(numList).trailer)
								throw new NullPointerException();

							else {

								// numList;

								--numList;

								stackOfLists.elementAt(numList).shuffleList(time);

							}

						}

					}

					else if (input == 6) {

						System.out.println("Which List do you want to play in order??");
						printStack(stackOfLists);
						System.out.print("Enter number of List: ");

						int l = sc.nextInt(); // number of list

						if (l == 1) {

							System.out.println("The history list can't be played in order");

							Thread.sleep(3000);
						}

						else {

							if (l > stackOfLists.size() || l < 1)
								throw new IndexOutOfBoundsException();

							else {

								stackOfLists.elementAt(l).playInOrder();

							}

						}

					}

					else if (input == 7) {

						System.out.println("Which list do you want to clear?");
						printStack(stackOfLists);
						System.out.print("Number of list: ");

						int n = sc.nextInt(); // number of list.

						if (n < 1 || n > stackOfLists.size())
							throw new IndexOutOfBoundsException();

						else {

							--n;

							clearList(stackOfLists.elementAt(n));

							if (stackOfLists.elementAt(n) == history)
								allVideos.returningNumberOfHitsToZero();

							System.out.println("List has been cleared");

							Thread.sleep(2000);

						}

					}

					else if (input == 8) {

						DoublyLinkedList recommendedForYou = new DoublyLinkedList("Recommended for you");

						for (int i = 0; i < 10; ++i) {

							int random = (int) (Math.random() * allVideos.size) + 1;

							recommendedForYou.addFirst(new Node(allVideos.searchForNode(random).ID,
									allVideos.searchForNode(random).title, allVideos.searchForNode(random).user,
									allVideos.searchForNode(random).category, allVideos.searchForNode(random).URL,
									allVideos.searchForNode(random).sizeMega, allVideos.searchForNode(random).hits));

						}

						recommendedForYou.printList();

						stackOfLists.push(recommendedForYou);

						// 10 seconds for user to scan recommended
						Thread.sleep(10000);

					}

					else if (input == 9) {

						System.out.println("Which list would you like to print??");

						printStack(stackOfLists);

						System.out.print("Enter number of list: ");

						// num of lists
						int integer = sc.nextInt();

						if (integer < 0 || integer > stackOfLists.size())
							throw new IndexOutOfBoundsException();

						else {

							--integer;

							System.out.println(
									"\nHere is the " + stackOfLists.elementAt(integer).nameOfList + " List\n ");

							stackOfLists.elementAt(integer).printList();

						}

						// 10 seconds to scan list
						Thread.sleep(10000);

					}

					else if (input == 10) {

						System.out.print("Enter The videos ID: ");

						int keyID = sc.nextInt();

						// Array Video Nodes.
						Node[] arrayOfL = new Node[40];

						Node pointer = allVideos.header.next;

						for (int i = 0; i < 40; ++i) {

							arrayOfL[i] = pointer;

							pointer = pointer.next;

						}

						binarySearch(arrayOfL, keyID);

					}

					else if (input == 11) {

						System.out.println("Here are the lists: ");

						printStack(stackOfLists);

						System.out.println();

						System.out.println("What video would you like to remove and from which list?");

						System.out.println();

						System.out.println("List: ");

						// number of list.
						int nL = sc.nextInt();

						// user cannot enter a number not listed in the menu
						if (nL < 1 || nL > stackOfLists.size())
							throw new IndexOutOfBoundsException();

						else {

							--nL; // The relation between the index and the position is index = position - 1.

							// if list is history list
							if (nL == 0) {

								System.out.println("Here is the " + stackOfLists.elementAt(nL).nameOfList + " List");

								stackOfLists.elementAt(nL).printList();

								System.out.println("\nNum of video: ");

								int nV = sc.nextInt();

								// returning view to 0
								stackOfLists.elementAt(nL).searchForNode(nV).hits = 0;

								// remove node from list
								stackOfLists.elementAt(nL).removeNodeAccordingToPosition(nV);

								System.out.println("Vide is removed");

								System.out.println("\nHerre is the list:\n");

								stackOfLists.elementAt(nL).printList();

								Thread.sleep(5000);

							}

							// if the list is not history
							else if (nL != 0) {

								System.out.println("Here is the " + stackOfLists.elementAt(nL).nameOfList + " List");

								stackOfLists.elementAt(nL).printList();

								System.out.println("\nNum of video: ");

								int nV = sc.nextInt();

								// remove the video from the list.
								stackOfLists.elementAt(nL).removeNodeAccordingToPosition(nV);

								System.out.println("Vide is removed");

								System.out.println("\nHerre is the list:\n");

								stackOfLists.elementAt(nL).printList();

								Thread.sleep(5000);

							}

						}

					}

					else if (input == 12) {

						printStack(stackOfLists);

						System.out.println();

						System.out.println("Which list would you like to move the video from:");

						int list1 = sc.nextInt();

						System.out.println("To what list do you want to move the video:");

						int list2 = sc.nextInt();

						System.out.println("\n");

						if (list1 < 1 || list1 > stackOfLists.size())
							throw new IndexOutOfBoundsException();

						else if (list2 < 1 || list2 > stackOfLists.size())
							throw new IndexOutOfBoundsException();

						else {

							--list1;

							--list2;

							if (list1 == 0 || list2 == 0) {

								System.out.println("The node cannot be moved from or to the history list.");

								Thread.sleep(3000);

							}

							else {

								System.out
										.println("Here is the " + stackOfLists.elementAt(list1).nameOfList + " List\n");

								stackOfLists.elementAt(list1).printList();

								System.out.println("From wich position would you like to move the video?");

								int p = sc.nextInt(); // position of node.

								stackOfLists.elementAt(list1).printList();

								moveNodeFromListToList(stackOfLists.elementAt(list1), stackOfLists.elementAt(list2), p);

								System.out.println("\nThe video is moved to " + stackOfLists.elementAt(list2).nameOfList
										+ " list\n");

								System.out.println("Here is the list: \n");

								stackOfLists.elementAt(list2).printList();

								Thread.sleep(5000);

							}

						}

					}

					else if (input == 13) {

						System.out.println("\nIn which list do you want to move the Video?");

						printStack(stackOfLists);

						Integer lp = new Integer(sc.nextInt()); // list position in the menue.

						--lp;

						if (lp == 0) {

							System.out.println("You cannot move a node in a history list");

							Thread.sleep(5000);

						}

						else if (lp < 0 || lp > (stackOfLists.size() - 1))
							throw new IndexOutOfBoundsException();

						else {

							System.out.println("Here is the " + stackOfLists.elementAt(lp).nameOfList + " List\n");

							stackOfLists.elementAt(lp).printList();

							System.out.println("\nfrom which and to wish position would you like to move the video?");

							System.out.print("\nposition1: ");

							int p1 = sc.nextInt();

							System.out.println("\npositoin2: ");

							int p2 = sc.nextInt();

							stackOfLists.elementAt(lp).moveNodeInList(p1, p2);

							System.out.println("\nThe video is moved here is the "
									+ stackOfLists.elementAt(lp).nameOfList + " list");

							stackOfLists.elementAt(lp).printList();

							Thread.sleep(5000);

						}

					}

					else if (input == 14)
						b = false;

					else {
						throw new InputMismatchException();
					}

					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
							+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}

			}

			catch (InputMismatchException e) {
				System.out.println("\nThe input has to be an integer\n");
				Thread.sleep(2000);
			}

			// entering unavailable index
			catch (IndexOutOfBoundsException a) {
				System.out.println("\nYou need to enter a number from the menue\n");
				Thread.sleep(2000);
			}

			// trying to print or execute an operation on empty list
			catch (NullPointerException q) {
				System.out.println("The list is empty");
				Thread.sleep(2000);
			}

			catch (Exception y) {
				System.out.println("\nAn error occured! please make sure you did the right steps!\n");
				Thread.sleep(2000);
			}

		}

	}

	public static void clearList(DoublyLinkedList l) {

		if (l.header.next == l.trailer)
			System.out.println("This list is already empty!");

		else {

			int sizeStatic = l.size;

			for (int i = 1; i <= sizeStatic; i++) {

				l.removeNodeAccordingToPosition(1);

			}

		}

	}

	// user customizing their list (automatically named your list)
	public static DoublyLinkedList createAList() {

		DoublyLinkedList l = new DoublyLinkedList("Your List");

		return l;

	}

	// for printing stack of lists
	public static void printStack(Stack<DoublyLinkedList> s) {

		position = 1;

		for (int i = 0; i < s.size(); ++i) {

			System.out.println(position + "." + s.elementAt(i).nameOfList);

			++position;

		}

	}

	// for moving nodes from one list to another
	public static void moveNodeFromListToList(DoublyLinkedList l, DoublyLinkedList l2, int positionOfNode)
			throws IndexOutOfBoundsException, NullPointerException {

		l2.addFirst(new Node(l.searchForNode(positionOfNode).ID, l.searchForNode(positionOfNode).title,
				l.searchForNode(positionOfNode).user, l.searchForNode(positionOfNode).category,
				l.searchForNode(positionOfNode).URL, l.searchForNode(positionOfNode).sizeMega,
				l.searchForNode(positionOfNode).hits));

		l.removeNodeAccordingToPosition(positionOfNode);

	}

	// printing list using recursion
	public static void printRecursively(Node pointer)// The parameter is the first node in the list we want to print.
	{

		if (pointer.next == null) {

			return;

		}

		++position;

		System.out.println(position + "." + pointer.title + " (" + pointer.ID + ")" + "\n");

		printRecursively(pointer.next);

	}

	// searching a list
	public static void binarySearch(Node[] list, int key) throws InterruptedException {

		int low = 0;

		int high = list.length - 1;

		while (high >= low) {

			int mid = (low + high) / 2;

			if (key < list[mid].ID)

				high = mid - 1;

			else if (key == list[mid].ID) {

				System.out.println("\nVideo title is " + list[mid].title + " published by the user " + list[mid].user
						+ " under the " + list[mid].category + "\ncategory. " + "The Videos ID is " + list[mid].ID
						+ " and the URL of it is " + list[mid].URL + " with a size " + list[mid].sizeMega
						+ " The video was watched " + list[mid].hits);

				Thread.sleep(5000);

				break;

			}

			else

				low = mid + 1;

		}

		Node pointer = list[-1 - low];

		System.out.println("\nVideo title is " + pointer.title + " published by the user " + pointer.user
				+ " under the " + pointer.category + "\ncategory. " + "The Videos ID is " + pointer.ID
				+ " and the URL of it is " + pointer.URL + " with a size " + pointer.sizeMega
				+ " The video was watched " + pointer.hits);

		Thread.sleep(5000);

	}

}
