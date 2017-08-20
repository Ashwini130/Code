import java.io.*;
import java.util.*;
// 2-blank 3-X 5-O
class ttt
{
	static int board[]=new int[9];
	static int x[]=new int[8];			//first 3 rows next 3 cols and remaining 2 diags
	static int o[]=new int[8];
	static char ch;
	static int flag[]=new int[100];
	static int turn=0;
	
	public static int make2()
	{
		if(board[4]==2)
			return 5;
		else if(board[2]==2)
			return 3;
		else if(board[0]==2)
			return 1;
		else if(board[8]==2)
			return 9;
			else return 7;	
	}
	
	public static void checkwin()
	{
		for(int i=0;i<8;i++)
			if(x[i]==15)
			{
				System.out.println("X wins");
				System.exit(0);	
			}
		for(int i=0;i<8;i++)
			if(o[i]==15)
			{
				System.out.println("O wins");
				System.exit(0);	
			}
		
	}
	
	public static void go(int p)
	{
		if(turn%2==1)
		{
			if(p==1)
			{
				board[3]=3;
				flag[1]=1;
				x[1]=x[1]+1; x[3]=x[3]+1;
				o[1]=o[1]-1; o[3]=o[3]-1;
			}
			else if(p==2)
			{
				board[8]=3; flag[2]=1;
				x[2]=x[2]+2; x[5]=x[5]+2; x[6]=x[6]+2;
				o[2]=o[2]-2; o[5]=o[5]-2; o[6]=o[6]-2;
			}
			else if(p==3)
			{
				board[1]=3; flag[3]=1;
				x[0]=x[0]+3; x[4]=x[4]+3; 
				o[0]=o[0]-3; o[4]=o[4]-3; 
			}
			else if(p==4)
			{
				board[2]=3; flag[4]=1;
				x[0]=x[0]+4; x[5]=x[5]+4; x[7]=x[7]+4;
				o[0]=o[0]-4; o[5]=o[5]-4; o[7]=o[7]-4;
			}
			else if(p==5)
			{
				board[4]=3; flag[5]=1;
				x[1]=x[1]+5; x[4]=x[4]+5; x[6]=x[6]+5; x[7]=x[7]+5;
				o[1]=o[1]-5; o[4]=o[4]-5; o[6]=o[6]-5; o[7]=o[7]-5;
			}
			else if(p==6)
			{
				board[6]=3; flag[6]=1;
				x[2]=x[2]+6; x[3]=x[3]+6; x[7]=x[7]+6;
				o[2]=o[2]-6; o[3]=o[3]-6; o[7]=o[7]-6;
			}		
			else if(p==7)
			{
				board[7]=3; flag[7]=1;
				x[2]=x[2]+7; x[4]=x[4]+7; 
				o[2]=o[2]-7; o[4]=o[4]-7; 
			}
			
			else if(p==8)
			{
				board[0]=3; flag[8]=1;
				x[0]=x[0]+8; x[3]=x[3]+8; x[6]=x[6]+8;
				o[0]=o[0]-8; o[3]=o[3]-8; o[6]=o[6]-8;
			}
			
			else if(p==9)
			{
				board[8]=3;	 flag[9]=1;
				x[1]=x[1]+9; x[5]=x[5]+9; 
				o[1]=o[1]-9; o[5]=o[5]-9; 
			}
		}
		else
		{
			if(p==1)
			{
				board[3]=5;	 flag[1]=1;
				o[1]=o[1]+1; o[3]=o[3]+1;
				x[1]=x[1]-1; x[3]=x[3]-1;
			}
			else if(p==2)
			{
				board[8]=5; flag[2]=1;
				o[2]=o[2]+2; o[5]=o[5]+2; o[6]=o[6]+2;
				x[2]=x[2]-2; x[5]=x[5]-2; x[6]=x[6]-2;
			}
			else if(p==3)
			{
				board[1]=5; flag[3]=1;
				o[0]=o[0]+3; o[4]=o[4]+3; 
				x[0]=x[0]-3; x[4]=x[4]-3; 
			}
			else if(p==4)
			{
				board[2]=5; flag[4]=1;
				o[0]=o[0]+4; o[5]=o[5]+4; o[7]=o[7]+4;
				x[0]=x[0]-4; x[5]=x[5]-4; x[7]=x[7]-4;
			}
			else if(p==5)
			{
				board[4]=5; flag[5]=1;
				o[1]=o[1]+5; o[4]=o[4]+5; o[6]=o[6]+5; o[7]=o[7]+5;
				x[1]=x[1]-5; x[4]=x[4]-5; x[6]=x[6]-5; x[7]=x[7]-5;
			}
			else if(p==6)
			{
				board[6]=5; flag[6]=1;
				o[2]=o[2]+6; o[3]=o[3]+6; o[7]=o[7]+6;
				x[2]=x[2]-6; x[3]=x[3]-6; x[7]=x[7]-6;
			}		
			else if(p==7)
			{
				board[7]=5; flag[7]=1;
				o[2]=o[2]+7; o[4]=o[4]+7; 
				x[2]=x[2]-7; x[4]=x[4]-7; 
			}
			
			else if(p==8)
			{
				board[0]=5; flag[8]=1;
				o[0]=o[0]+8; o[3]=o[3]+8; o[6]=o[6]+8;
				x[0]=x[0]-8; x[3]=x[3]-8; x[6]=x[6]-8;
			}
			
			else if(p==9)
			{
				board[8]=5; flag[9]=1;
				o[1]=o[1]+9; o[5]=o[5]+9; 
				x[1]=x[1]-9; x[5]=x[5]-9; 
			}
		}
		turn++;
		for(int i=0;i<=10;i++)
			System.out.print(flag[i]+" ");
		checkwin();
	}
		
	public static int blank2()
	{
		for(int i=0;i<9;i++)
			if(board[i]==2)
				return i+1;		
		return 0;
	}
	
	public static int PossWin(int p)
	{
		int ret=0;
		if(p==3)
		{
			for(int k=0;k<8;k++)
				if(15-x[k]<=9 && 15-x[k]>=0 && flag[15-x[k]]==0)
				{
					ret=15-x[k];
					break;
				}
			return ret;
		}
		else
		{
			for(int k=0;k<8;k++)
				if(15-o[k]<=9 && 15-o[k]>=0 && flag[15-o[k]]==0)
				{	
					ret=15-o[k];
					break;
				}
			return ret;
		}
	}
	
	public static void display()
	{
		System.out.println();		
		for(int i=0;i<9;i++)
		{
			if(board[i]==3)
				System.out.print(" X ");
			else if(board[i]==5)
				System.out.print(" O ");
			else if(board[i]==2)
				System.out.print(" _ ");
			if(i==2 || i==5)
				System.out.println();
		}
		System.out.println();		
		
		for(int k=0;k<8;k++)
			System.out.print(x[k]+" ");
		
		System.out.println();		
		for(int k=0;k<8;k++)
			System.out.print(o[k]+" ");
	}
	
	public static int getmove()
	{
		Scanner in = new Scanner(System.in);
		if(turn<=9)
		{
			System.out.println("\nEnter the block number for a move. The current state of the board is as shown below:");
			display();
			int mv=in.nextInt();
			return mv;
		}
		else
			return 0;	
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		//Making the board blank
		for(int i=0;i<9;i++)
				board[i]=2;
			
		System.out.println("Choose Player X or O");
		ch=in.next().charAt(0);
		
		if(ch=='x' || ch=='X' || ch=='o' || ch=='O')
			turn=1;
		else 
		{
				System.out.println("Invalid value");
				return;
		}
		
		System.out.println("\nThe numbers of board positions are as follows:");
		System.out.println("8 3 4");
		System.out.println("1 5 9");
		System.out.println("6 7 2");
		
		if(ch=='o'|| ch=='O')
		{
			go(8);					//turn 1
			go(getmove());			//turn 2
			
			if(board[1]==2)			//turn 3
				go(2);
			else go(4);
						
			go(getmove());			//turn 4
			
			if(PossWin(3)!=0)		//turn 5
				go(PossWin(3));
			else if(PossWin(5)!=0)
				go(PossWin(5));
			else if(board[5]==2)
				go(6);
			else go(4);
			
			go(getmove());			//turn 6
			
			if(PossWin(3)!=0)		//turn 7
				go(PossWin(3));
			else if(PossWin(5)!=0)
				go(PossWin(5));
			else go(blank2());
			
			go(getmove());			//turn 8			
			
			if(PossWin(3)!=0)		//turn 9
				go(PossWin(3));
			else if(PossWin(5)!=0)
				go(PossWin(5));
			else go(blank2());
	
		}
		else
		{
			go(getmove());			//turn 1

			if(board[4]==2)			//turn 2
				go(5);
			else go(8);
						
			go(getmove());			//turn 3
			
			if (PossWin(3)!=0)		//turn 4
				go(PossWin(3));
			else go(make2());
			
			go(getmove());			//turn 5			
			
			if(PossWin(5)!=0)		//turn 6
				go(PossWin(5));
			else if(PossWin(3)!=0)
				go(PossWin(3));
			else go(make2());
				
			go(getmove());			//turn 7
			
			if(PossWin(5)!=0)		//turn 8
				go(PossWin(5));
			else if(PossWin(3)!=0)
				go(PossWin(3));
			else go(blank2());
			
			go(getmove());			//turn 9
		}
	}	
}
