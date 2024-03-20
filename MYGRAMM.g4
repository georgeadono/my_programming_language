grammar MYGRAMM;

@lexer::header{
	import java.util.ArrayList;
}

@members {
	class Var {
		private float value;
		private String name;
		private int countDeclarations;
		
		Var(float value, String name){
			this.value = value;
			this.name = name;
			countDeclarations = 1;
		}
		
		Var(String name){
			this.name = name;
			countDeclarations = 1;
		}
		
		public void setValue(float value){
			this.value = value;
		}
		
		public float getValue(){
			return this.value;
		}
		
		public String getName(){
			return this.name;
		}
		
		public void increaseDeclaration(){
			countDeclarations++;
		}
		
		public int getCountDeclarations(){
			return countDeclarations;
		}
	}
	
	class IntVar {
		private int value;
		private String name;
		private int countDeclarations;
		
		IntVar(int value, String name){
			this.value = value;
			this.name = name;
			countDeclarations = 1;
		}
		
	    IntVar(String name){
			this.name = name;
			countDeclarations = 1;
		}
		
		public void setValue(int value){
			this.value = value;
		}
		
		public int getValue(){
			return this.value;
		}
		
		public String getName(){
			return this.name;
		}
		
		public void increaseDeclaration(){
			countDeclarations++;
		}
		
		public int getCountDeclarations(){
			return countDeclarations;
		}
	}
	
	
	//Arrays: [Var -> float object, IntVar -> int object]
	ArrayList<Var> arrFloatObj = new ArrayList<Var>();
	ArrayList<IntVar> arrIntObj = new ArrayList<IntVar>();
	
	
	int countLine=1;
	
	public boolean checkExist2(String var, ArrayList<Var> arr, boolean flag) {
		for(int i=0; i<arr.size(); i++){
							if (arr.get(i).getName().equals(var) && flag){
								arr.get(i).increaseDeclaration();
								return true;
							}
							if(arr.get(i).getName().equals(var)){
								return true;
							}
			}
		return false;
	}
	
	public boolean checkIntExist2(String var, ArrayList<IntVar> arr, boolean flag) {
		for(int i=0; i<arr.size(); i++){
							if (arr.get(i).getName().equals(var) && flag){
								arr.get(i).increaseDeclaration();
								return true;
							}
							if(arr.get(i).getName().equals(var)){
								return true;
							}
			}
		return false;
	}
	
	public int countIntOverDeclatarions(ArrayList<IntVar> arr){
		int countVars = 0;
		
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i).getCountDeclarations() > 1){
				countVars++;
			}
		}
		return countVars;
	}
	
	public int countFloatOverDeclatarions(ArrayList<Var> arr){
		int countVars = 0;
		
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i).getCountDeclarations() > 1){
				countVars++;
			}
		}
		return countVars;
	}
	
	public void findFloatOverDeclatarions(ArrayList<Var> arr){
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i).getCountDeclarations() > 1){
				System.out.println(arr.get(i).getName()+":"+arr.get(i).getCountDeclarations());
			}
		}
	}
	
	public void findIntOverDeclatarions(ArrayList<IntVar> arr){
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i).getCountDeclarations() > 1){
				System.out.println(arr.get(i).getName()+":"+arr.get(i).getCountDeclarations());
			}
		}
	}

	
}



//Starter
program: PROGRAM 
		 declarations statements 
		 ENDPROGRAM ;

declarations: ( DECLARE varlist ENDDECLARE )* ;

varlist

: INTEGER variable {	
				if(!checkIntExist2($variable.text, arrIntObj, true)){
					IntVar newVariable = new IntVar($variable.text);
					arrIntObj.add(newVariable);
				}
				
			} 
  ( COMMA variable {
				if(!checkIntExist2($variable.text, arrIntObj, true)){
					IntVar newVariable = new IntVar($variable.text);
					arrIntObj.add(newVariable);
				}
			}
		)* 
  |
  REAL variable {
				if(!checkExist2($variable.text, arrFloatObj, true)){
					Var newVariable = new Var($variable.text);
					arrFloatObj.add(newVariable);
				}
			}
 ( COMMA variable { 
				if(!checkExist2($variable.text, arrFloatObj, true)){
					Var newVariable = new Var($variable.text);
					arrFloatObj.add(newVariable);
				}
			}
		)* ;

statements
@after {
	System.out.println("\nNumber of declared variables: " + (arrIntObj.size()+arrFloatObj.size()));
	System.out.println("Number of declared integer variables: " + arrIntObj.size());
	System.out.println("Number of declared real variables: " + arrFloatObj.size()+"\n");
	System.out.println("Number of double declared variables: " + (countIntOverDeclatarions(arrIntObj)+countFloatOverDeclatarions(arrFloatObj)));
	System.out.println("More specifically: ");
	findIntOverDeclatarions(arrIntObj);
	findFloatOverDeclatarions(arrFloatObj);
	System.out.println("Number of double declared integer variables: " + countIntOverDeclatarions(arrIntObj));
	System.out.println("Number of double declared real variables: " + countFloatOverDeclatarions(arrFloatObj));
	System.out.println("\nSyntactically correct program");
	}
: statement ( SEMICOLON statement )* ;

statement: INPUT input_tail | 
		   PRINT print_tail | 
		   variable {
				//Check if variable is declared
				if(!checkIntExist2($variable.text, arrIntObj, false) && !checkExist2($variable.text, arrFloatObj, false)){
					System.out.println("Variable " + $variable.text + " not declared in line " + _ctx.getStart().toString().split(",")[3].split(":")[0]);
				}
			}
		   assign_tail;
		   
input_tail: L_PAR variable R_PAR {
							if(!checkIntExist2($variable.text, arrIntObj, false) && !checkExist2($variable.text, arrFloatObj, false)){
								System.out.println("Variable " + $variable.text + " not declared in line " +_ctx.getStart().toString().split(",")[3].split(":")[0]);
							}
						};

print_tail: L_PAR expression R_PAR ;

assign_tail: ASSIGN expression;

expression: sign term ( PLUS term | MINUS term )* ;

sign: PLUS | MINUS |  ;

term: factor ( STAR factor | SLASH factor )* ;

factor: numerical_constant 
		|
		variable {
			//Check if variable that try to set exist in array
			if(!checkIntExist2($variable.text, arrIntObj, false) && !checkExist2($variable.text, arrFloatObj, false)){
				System.out.println("Variable " + $variable.text + " not declared in line " + _ctx.getStart().toString().split(",")[3].split(":")[0]);
				System.out.println("Variable " + $variable.text + " not set before use in line " + _ctx.getStart().toString().split(",")[3].split(":")[0]);
			}
			//Check in which array var exist and if has value
			else if(checkIntExist2($variable.text, arrIntObj, false)){
				for(int i=0; i<arrIntObj.size(); i++){
					if(arrIntObj.get(i).getName().equals($variable.text) && (arrIntObj.get(i).getValue() == 0)){
						System.out.println("Variable " + $variable.text + " not set before use in line " + _ctx.getStart().toString().split(",")[3].split(":")[0]);
					}
				}
			}
			else if(checkExist2($variable.text, arrFloatObj, false)){
				for(int i=0; i<arrFloatObj.size(); i++){
					if(arrFloatObj.get(i).getName().equals($variable.text) && (arrFloatObj.get(i).getValue() == 0)){
						System.out.println("Variable " + $variable.text + " not set before use in line " + _ctx.getStart().toString().split(",")[3].split(":")[0]);
					}
				}
			}
			else{
				break;
			}	
		}
		| 
		L_PAR expression R_PAR ;
		
numerical_constant: NUMBER;

variable: LETTER+ LETTER* | LETTER+ NUMBER*;
		 
PROGRAM: 'program';
DECLARE: 'declare';
INTEGER: 'integer';
REAL: 'real';
COMMA: ',';
SEMICOLON: ';';
L_PAR: '(';
R_PAR: ')';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
ASSIGN: ':=';
NULL: ' ' -> skip ;
LETTER: [a-zA-Z];
NUMBER: [0-9]+ | [0-9]+.[0-9]+;
INPUT: 'input';
PRINT: 'print';
ENDDECLARE: 'enddeclare';
ENDPROGRAM: 'endprogram';
WS : [ \t\r]+  -> skip ;
NEWLINE: [\n]+ -> skip;