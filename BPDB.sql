
DROP TABLE            USR                        CASCADE CONSTRAINT;
DROP TABLE            DRAFT                      CASCADE CONSTRAINT;
DROP TABLE            APPLY                      CASCADE CONSTRAINT;
DROP TABLE            HR                         CASCADE CONSTRAINT;
DROP TABLE            ADMIN                      CASCADE CONSTRAINT;
DROP TABLE            SALARY                     CASCADE CONSTRAINT;
DROP TABLE            ACCOUNT                    CASCADE CONSTRAINT;
DROP TABLE            BILLING                    CASCADE CONSTRAINT;
DROP TABLE            DISTRIBUTION               CASCADE CONSTRAINT;
DROP TABLE            GENERATION_DHAKA           CASCADE CONSTRAINT;
DROP TABLE            GENERATION_KHULNA          CASCADE CONSTRAINT; 
DROP TABLE            GENERATION_RAUJAN          CASCADE CONSTRAINT;
DROP TABLE            GENERATION_GRASHAL         CASCADE CONSTRAINT; 
DROP TABLE            GENERATION_SHIDDERGANJ     CASCADE CONSTRAINT;





   

DROP PROCEDURE        DELETE_USR                                   ;
DROP PROCEDURE        DELETE_DRAFT                                 ;
DROP PROCEDURE        DELETE_APPLY                                 ;
DROP PROCEDURE        DELETE_HR                                    ;
DROP PROCEDURE        DELETE_ADMIN                                 ;
DROP PROCEDURE        DELETE_SALARY                                ;
DROP PROCEDURE        DELETE_ACCOUNT                               ;
DROP PROCEDURE        DELETE_BILLING                               ;
DROP PROCEDURE        DELETE_DISTRIBUTION                          ;
DROP PROCEDURE        DELETE_GENERATION_DHAKA                      ;
DROP PROCEDURE        DELETE_GENERATION_KHULNA                     ;
DROP PROCEDURE        DELETE_GENERATION_RAUJAN                     ;
DROP PROCEDURE        DELETE_GENERATION_GRASHAL                    ;
DROP PROCEDURE        DELETE_GENERATION_SHIDDERGANJ                ;





DROP FUNCTION         INSERT_UPDATE_DRAFT                          ;
DROP FUNCTION         INSERT_UPDATE_APPLY                          ;
DROP FUNCTION         INSERT_UPDATE_HR                             ;
DROP FUNCTION         INSERT_UPDATE_ADMIN                          ;
DROP FUNCTION         INSERT_UPDATE_SALARY                         ;
DROP FUNCTION         INSERT_UPDATE_ACCOUNT                        ; 
DROP FUNCTION         INSERT_UPDATE_BILLING                        ;
DROP FUNCTION         INSERT_UPDATE_DISTRIBUTION                   ;
DROP FUNCTION         INSERT_UPDATE_GENERATION_DHAKA               ; 
DROP FUNCTION         INSERT_UPDATE_GENERATION_KHULNA              ; 
DROP FUNCTION         INSERT_UPDATE_GENERATION_RAUJAN              ; 
DROP FUNCTION         INSERT_UPDATE_GENERATION_GRASHAL             ; 
DROP FUNCTION         INSERT_UPDATE_GENERATION_SHIDDERGANJ         ; 




----------------------------------------------------------------------------
--                            USR
----------------------------------------------------------------------------
CREATE TABLE  USR (	
        ID                               VARCHAR2          (20),   
	NAME                             CHAR              (20), 
	DESIG                            VARCHAR2          (30), 
	FULL_NAME                        CHAR              (30), 
        PASSWORD                         VARCHAR2          (20),
        CONSTRAINT ID_PK                 PRIMARY KEY(ID)
        
   ); 


----------------------------------------------------------------------------
--                            DRAFT
----------------------------------------------------------------------------
CREATE TABLE  DRAFT (	
        BDN_NUMBER                       VARCHAR2          (500)   ,   
	NAME                             CHAR              (30)   , 
	TAKA                             NUMBER            (10)   , 
	DATES                            DATE                     , 
        ADDRESS                          VARCHAR2          (100)  ,
        CONSTRAINT BDN_NUMBER            PRIMARY KEY(BDN_NUMBER)
        
   ); 
------------------------------------------------------------------------------- 
--                           APPLY                       
-------------------------------------------------------------------------------
CREATE TABLE APPLY(

      FROM_NUMBER                           VARCHAR2(500) ,         
      NAME                                  CHAR(50)      ,
      FATHER_NAME                           CHAR(50)      ,
      MOTHER_NAME                 	    CHAR(50)      ,
      GENDER                                CHAR(10)      ,
      AGE                         	    VARCHAR2(50)  ,
      EDUCATION_QUALIFICATION    	    VARCHAR2(100) ,
      CONTACT_NUMBER              	    NUMBER(30)    ,
      BDN_NUMBER                  	    VARCHAR2(500)  ,
      EMAIL_ADDRESS               	    VARCHAR2(50)  ,

      CONSTRAINT BDN_NUMBER_P                 FOREIGN KEY(BDN_NUMBER) REFERENCES DRAFT(BDN_NUMBER)

     
 );


------------------------------------------------------------------------------
--                             HR
------------------------------------------------------------------------------
CREATE TABLE HR(
        ID    	                              VARCHAR2    (30),  
	DESIGNATION                           VARCHAR2	  (50),
	NAME			              CHAR	  (50),
        FATHER_NAME      	              CHAR        (50),
        MOTHER_NAME      	              CHAR        (50),  
        GENDER           	              CHAR        (10),
        AGE              	              NUMBER      (10),
	DATE_OF_BIRTH		              DATE            ,
	CONTACT_NUMBER		              NUMBER	  (30),
	E_MAIL_ID		              VARCHAR2    (30),	
        EDUCATION_BACKGROUND                  VARCHAR2    (100),
	JOINING_DATE                   	      DATE             ,
        PRESENT_ADDRESS             	      VARCHAR2    (500),
        PERMANENT_ADDRESS                     VARCHAR2    (500),

        CONSTRAINT ID_PK1    	              PRIMARY KEY(ID),
	CONSTRAINT DOB_JD_CK4                 CHECK(DATE_OF_BIRTH<JOINING_DATE)
       
   );


-------------------------------------------------------------------------------
--                            ADMIN
-------------------------------------------------------------------------------
CREATE TABLE ADMIN(
		  ID                         VARCHAR2 (20)  , 
                  DESIGNATION                VARCHAR2 (30)  ,
		  EMPLOYEE_NAME              CHAR     (50)  ,
                  INCREMENTS                 NUMBER   (10)  ,
                  DECREMENTS                 NUMBER   (10)  ,
                  ACR                        VARCHAR2 (1000),
		  YEAR                       VARCHAR2 (20)  ,
 		  
		  CONSTRAINT ID_FK                  FOREIGN KEY(ID) REFERENCES HR(ID)
     
                  
   );


-------------------------------------------------------------------------------
--                            SALARY
-------------------------------------------------------------------------------
CREATE TABLE SALARY(
      ID                 			   VARCHAR2 (20),     
      DESIGNATION           			   VARCHAR2 (50),
      ACCOUNT_NUMBER        			   VARCHAR2 (50),
      NAME_OF_MONTH         			   VARCHAR2 (50),
      NAME_OF_YEAR          			   VARCHAR2 (50),
      CLEARANCE                                    CHAR     (10),
      
   
      CONSTRAINT ID_NO                               FOREIGN KEY(ID) REFERENCES HR(ID)  ,
      CONSTRAINT ACCOUNT_NUMBER                      PRIMARY KEY(ACCOUNT_NUMBER)
   
   );

-------------------------------------------------------------------------------
--                            ACCOUNT
-------------------------------------------------------------------------------
CREATE TABLE ACCOUNT(
      ID                   			 VARCHAR2 (20)      ,     
      BASIC_SALARY          			 NUMBER   (10,5)    ,
      HOUSE_RENT            			 NUMBER   (10,5)    ,
      BONUS                 			 NUMBER   (20,5)    ,
      INCREMENTS               			 NUMBER   (10,5)    DEFAULT 500,
      OTHER_ALLOUNCE       			 NUMBER   (20,5)    ,
      MEDICAL              			 NUMBER   (10,5)    ,
      PHONE                			 NUMBER   (10,5)    ,
      TOTAL_AMOUNT          			 NUMBER   (20,5)    ,
      PAY_AMOUNT            			 NUMBER   (20,5)    ,
      DUE_AMOUNT            			 NUMBER   (20,5)    ,
      NAME_OF_MONTH        			 VARCHAR2 (10)      ,
      NAME_OF_YEAR        			 VARCHAR2 (10)      ,
      
      CONSTRAINT EMPLOYEE_ID_FK                  FOREIGN KEY(ID) REFERENCES HR(ID)
           
   );

-------------------------------------------------------------------------------
--                                BILLING
-------------------------------------------------------------------------------
CREATE TABLE BILLING(
      METER_ID              			VARCHAR2 (200)   ,     
      CUSTOMER_NAME         			CHAR     (50)    ,
      CONTACT_NUMBER        			NUMBER   (20)    ,
      AREA_ZONE             			VARCHAR2 (20)    ,
      TARIFF_CATEGORY       			NUMBER   (10,5)  , 
      USING_WATT            			VARCHAR2 (200)     DEFAULT 0,
      NAME_OF_MONTH         			VARCHAR2 (20),
      NAME_OF_YEAR         			VARCHAR2 (20),
      TOTAL_AMOUNT          			VARCHAR2 (50),
     
      CONSTRAINT METER_ID        		PRIMARY KEY(METER_ID)
      
   );

------------------------------------------------------------------------------- 
--                            DISTRIBUTION                            
-------------------------------------------------------------------------------
CREATE TABLE DISTRIBUTION(
      
      DISTRIBUTION_NUMBER   			VARCHAR2 (1000),    
      COMPANY_NAME          			VARCHAR2 (50)  ,
      DIVISION_NAME         			CHAR (40)      ,
      DISTRICT_NAME        		 	CHAR (40)      ,
      AREA_ZONE             			CHAR (20)      ,
      TOTAL_POWER_AMOUNT    			VARCHAR2 (50)  ,
      DEMAND_POWER_AMOUNT   			VARCHAR2(50)   ,
      LOAD_SHEADING         			VARCHAR2(50)   ,
       
  
      CONSTRAINT DISTRIBUTION_CK   		CHECK(TOTAL_POWER_AMOUNT<DEMAND_POWER_AMOUNT) 
  

 );


------------------------------------------------------------------------------- 
--                           GENERATION_DHAKA                           
-------------------------------------------------------------------------------
CREATE TABLE GENERATION_DHAKA(
          
      TRANSMETER_ID               			VARCHAR2(100),
      COMPANY_NAME                			VARCHAR2(100),
      NAME_OF_MONTH               			VARCHAR2(50),
      NAME_OF_YEAR                			VARCHAR2(50),
      BUDGETING_AMOUNT            			NUMBER(20,10)  DEFAULT 0,
      TARGET_POWER_AMOUNT         			NUMBER(20,10),
      POWER_SYSTEM_LOSS           			NUMBER(20,10),
      USABLE_POWER_AMOUNT        			NUMBER(20,10),
      TOTAL_BALENCE_AMOUNT        			NUMBER(20,10),
      SERIAL_NUMBER               			VARCHAR2(500),   
      
      CONSTRAINT GENERATION_DHAKA_PK    		PRIMARY KEY(TRANSMETER_ID)
     
   );



------------------------------------------------------------------------------- 
--                           GENERATION_KHULNA                           
-------------------------------------------------------------------------------
CREATE TABLE GENERATION_KHULNA(
          
      TRANSMETER_ID               			VARCHAR2(100),
      COMPANY_NAME                			VARCHAR2(100),
      NAME_OF_MONTH               			VARCHAR2(50),
      NAME_OF_YEAR                			VARCHAR2(50),
      BUDGETING_AMOUNT            			NUMBER(20,10) DEFAULT 0,
      TARGET_POWER_AMOUNT         			NUMBER(20,10),
      POWER_SYSTEM_LOSS           			NUMBER(20,10),
      USABLE_POWER_AMOUNT         			NUMBER(20,10),
      TOTAL_BALENCE_AMOUNT        			NUMBER(20,10),
      SERIAL_NUMBER               			VARCHAR2(500),  

      CONSTRAINT GENERATION_KHULNA_PK                   PRIMARY KEY(TRANSMETER_ID)
     
   );







------------------------------------------------------------------------------- 
--                           GENERATION_RAUJAN                           
-------------------------------------------------------------------------------
CREATE TABLE GENERATION_RAUJAN(
          
      TRANSMETER_ID               				VARCHAR2(100),
      COMPANY_NAME                				VARCHAR2(100),
      NAME_OF_MONTH              				VARCHAR2(50),
      NAME_OF_YEAR                				VARCHAR2(50),
      BUDGETING_AMOUNT            				NUMBER(20,10) DEFAULT 0,
      TARGET_POWER_AMOUNT         				NUMBER(20,10),
      POWER_SYSTEM_LOSS           				NUMBER(20,10),
      USABLE_POWER_AMOUNT         				NUMBER(20,10),
      TOTAL_BALENCE_AMOUNT        				NUMBER(20,10),
      SERIAL_NUMBER               				VARCHAR2(500),  

      CONSTRAINT GENERATION_RAUJAN_PK    			PRIMARY KEY(TRANSMETER_ID)
     
   );



------------------------------------------------------------------------------- 
--                           GENERATION_GRASHAL                          
-------------------------------------------------------------------------------
CREATE TABLE GENERATION_GRASHAL(
          
      TRANSMETER_ID               			VARCHAR2(100),
      COMPANY_NAME               		        VARCHAR2(100),
      NAME_OF_MONTH               			VARCHAR2(50),
      NAME_OF_YEAR                			VARCHAR2(50),
      BUDGETING_AMOUNT            			NUMBER(20,10) DEFAULT 0,
      TARGET_POWER_AMOUNT         			NUMBER(20,10),
      POWER_SYSTEM_LOSS           			NUMBER(20,10),
      USABLE_POWER_AMOUNT         			NUMBER(20,10),
      TOTAL_BALENCE_AMOUNT        			NUMBER(20,10),
      SERIAL_NUMBER               			VARCHAR2(500),  

      CONSTRAINT GENERATION_GRASHAL_PK    		PRIMARY KEY(TRANSMETER_ID)
     
   );



------------------------------------------------------------------------------- 
--                           GENERATION_SHIDDERGANJ                           
-------------------------------------------------------------------------------
CREATE TABLE GENERATION_SHIDDERGANJ(
          
      TRANSMETER_ID               				VARCHAR2(100),
      COMPANY_NAME                				VARCHAR2(100),
      NAME_OF_MONTH               				VARCHAR2(50),
      NAME_OF_YEAR                				VARCHAR2(50),
      BUDGETING_AMOUNT            				NUMBER(20,10) DEFAULT 0,
      TARGET_POWER_AMOUNT         				NUMBER(20,10),
      POWER_SYSTEM_LOSS           				NUMBER(20,10),
      USABLE_POWER_AMOUNT         				NUMBER(20,10),
      TOTAL_BALENCE_AMOUNT        				NUMBER(20,10),
      SERIAL_NUMBER               				VARCHAR2(500),  

      CONSTRAINT GENERATION_SHIDDERGANJ_PK    			PRIMARY KEY(TRANSMETER_ID)
     
   );

-----------------------------------------------------------------------------------------
--		TRIGGER  APPLY_GENETATE
-----------------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER  APPLY
before insert on APPLY
for each row
declare
    cnt number;
    next number;
begin
        select count(*) into cnt from APPLY;
        if cnt > 0 then
         	select max(FROM_NUMBER) into next from APPLY;
         	next:=next+1;
         	:new.FROM_NUMBER:=next;
        else
         	:new.FROM_NUMBER:=101;  
	end if;
end;

/



-----------------------------------------------------------------------------------------
--		TRIGGER  DISTRIBUTION_GENETATE
-----------------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER  DISTRIBUTION
before insert on DISTRIBUTION
for each row
declare
    cnt number;
    next number;
begin
        select count(*) into cnt from DISTRIBUTION;
        if cnt > 0 then
         	select max(DISTRIBUTION_NUMBER) into next from DISTRIBUTION;
         	next:=next+1;
         	:new.DISTRIBUTION_NUMBER:=next;
        else
         	:new.DISTRIBUTION_NUMBER:=101;  
	end if;
end;

/




-----------------------------------------------------------------------------------------
--		TRIGGER  GENERATION_DHAKA_GENETATE
-----------------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER  GENERATION_DHAKA
before insert on GENERATION_DHAKA
for each row
declare
    cnt number;
    next number;
begin
        select count(*) into cnt from GENERATION_DHAKA;
        if cnt > 0 then
         	select max(SERIAL_NUMBER) into next from GENERATION_DHAKA;
         	next:=next+1;
         	:new.SERIAL_NUMBER:=next;
        else
         	:new.SERIAL_NUMBER:=110088;  
	end if;
end;

/
-----------------------------------------------------------------------------------------
--		TRIGGER  GENERATION_KHULNA_GENETATE
-----------------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER  GENERATION_KHULNA
before insert on GENERATION_KHULNA
for each row
declare
    cnt number;
    next number;
begin
        select count(*) into cnt from GENERATION_KHULNA;
        if cnt > 0 then
         	select max(SERIAL_NUMBER) into next from GENERATION_KHULNA;
         	next:=next+1;
         	:new.SERIAL_NUMBER:=next;
        else
         	:new.SERIAL_NUMBER:=220088;  
	end if;
end;

/



-----------------------------------------------------------------------------------------
--		TRIGGER  GENERATION_RAUJAN_GENETATE
-----------------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER  GENERATION_RAUJAN
before insert on GENERATION_RAUJAN
for each row
declare
    cnt number;
    next number;
begin
        select count(*) into cnt from GENERATION_RAUJAN;
        if cnt > 0 then
         	select max(SERIAL_NUMBER) into next from GENERATION_RAUJAN;
         	next:=next+1;
         	:new.SERIAL_NUMBER:=next;
        else
         	:new.SERIAL_NUMBER:=330088;  
	end if;
end;

/


-----------------------------------------------------------------------------------------
--		TRIGGER  GENERATION_GRASHAL_GENETATE
-----------------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER  GENERATION_GRASHAL
before insert on GENERATION_GRASHAL
for each row
declare
    cnt number;
    next number;
begin
        select count(*) into cnt from GENERATION_GRASHAL;
        if cnt > 0 then
         	select max(SERIAL_NUMBER) into next from GENERATION_GRASHAL;
         	next:=next+1;
         	:new.SERIAL_NUMBER:=next;
        else
         	:new.SERIAL_NUMBER:=440088;  
	end if;
end;

/




-----------------------------------------------------------------------------------------
--		TRIGGER  GENERATION_SHIDDERGANJ_GENETATE
-----------------------------------------------------------------------------------------


CREATE OR REPLACE TRIGGER  GENERATION_SHIDDERGANJ
before insert on GENERATION_SHIDDERGANJ
for each row
declare
    cnt number;
    next number;
begin
        select count(*) into cnt from GENERATION_SHIDDERGANJ;
        if cnt > 0 then
         	select max(SERIAL_NUMBER) into next from GENERATION_SHIDDERGANJ;
         	next:=next+1;
         	:new.SERIAL_NUMBER:=next;
        else
         	:new.SERIAL_NUMBER:=550088;  
	end if;
end;


/

-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_USR
-----------------------------------------------------------------------------------------

create or replace procedure delete_USR(NID in number) as

begin
	
	delete from USR where ID =NID;
end;

/

-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_DRAFT
-----------------------------------------------------------------------------------------


create or replace procedure delete_DRAFT(B  IN NUMBER) as
cursor DRAFT is select * from DRAFT where BDN_NUMBER = B;
A DRAFT%ROWTYPE;

begin
	open DRAFT;
	loop
	fetch DRAFT into A;
        exit when DRAFT%NOTFOUND;
		delete_DRAFT(A.BDN_NUMBER);
	end loop;
	close DRAFT;
	
end; 

/


-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_APPLY
-----------------------------------------------------------------------------------------


create or replace procedure delete_APPLY(FRO  IN NUMBER) as
cursor APPLY is select * from APPLY where FROM_NUMBER = FRO;
A APPLY%ROWTYPE;

begin
	open APPLY;
	loop
	fetch APPLY into A;
        exit when APPLY%NOTFOUND;
		delete_APPLY(A.FROM_NUMBER);
	end loop;
	close APPLY;
	
end; 

/


-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_HR
-----------------------------------------------------------------------------------------

create or replace procedure delete_HR(NID  IN NUMBER) as
cursor HR is select * from HR where ID = NID;
H HR%ROWTYPE;

begin
	open HR;
	loop
	fetch HR into H;
        exit when HR%NOTFOUND;
		delete_HR(H.ID);
	end loop;
	close HR;
	
end;

/


-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_ADMIN
-----------------------------------------------------------------------------------------

create or replace procedure delete_ADMIN(NID  IN NUMBER) as
cursor ADMIN is select * from ADMIN where ID = NID;
AD ADMIN%ROWTYPE;

begin
	open ADMIN;
	loop
	fetch ADMIN into AD;
        exit when ADMIN%NOTFOUND;
		delete_ADMIN(AD.ID);
	end loop;
	close ADMIN;
	
end;

/


-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_SALARY
-----------------------------------------------------------------------------------------

create or replace procedure delete_SALARY(NID  IN NUMBER) as
cursor SALARY is select * from SALARY where ID = NID;
S SALARY%ROWTYPE;

begin
	open SALARY;
	loop
	fetch SALARY into S;
        exit when SALARY%NOTFOUND;
		delete_SALARY(S.ID);
	end loop;
	close SALARY;
	
end;

/


-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_ACCOUNT
-----------------------------------------------------------------------------------------

create or replace procedure delete_ACCOUNT(NID  IN NUMBER) as
cursor ACCOUNT is select * from ACCOUNT where ID = NID;
AC ACCOUNT%ROWTYPE;

begin
	open ACCOUNT;
	loop
	fetch ACCOUNT into AC;
        exit when ACCOUNT%NOTFOUND;
		delete_ACCOUNT(AC.ID);
	end loop;
	close ACCOUNT;
	
end;

/
-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_BILLING
-----------------------------------------------------------------------------------------

create or replace procedure delete_BILLING(BNUM  IN NUMBER) as
cursor BILLING is select * from BILLING where METER_ID = BNUM;
N BILLING%ROWTYPE;

begin
	open BILLING;
	loop
	fetch BILLING into N;
        exit when BILLING%NOTFOUND;
		delete_BILLING(N.METER_ID);
	end loop;
	close BILLING;
	
end;

/

-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_DISTRIBUTION
-----------------------------------------------------------------------------------------

create or replace procedure delete_DISTRIBUTION(DNUM  IN NUMBER) as
cursor DISTRIBUTION is select * from DISTRIBUTION where DISTRIBUTION_NUMBER = DNUM;
N DISTRIBUTION%ROWTYPE;

begin
	open DISTRIBUTION;
	loop
	fetch DISTRIBUTION into N;
        exit when DISTRIBUTION%NOTFOUND;
		delete_DISTRIBUTION(N.DISTRIBUTION_NUMBER);
	end loop;
	close DISTRIBUTION;
	
end;

/





-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_GENERATION_DHAKA  
-----------------------------------------------------------------------------------------

create or replace procedure delete_GENERATION_DHAKA  (GNUM  IN NUMBER) as
cursor GENERATION_DHAKA  is select * from GENERATION_DHAKA   where TRANSMETER_ID= GNUM;
N GENERATION_DHAKA%ROWTYPE;

begin
	open GENERATION_DHAKA  ;
	loop
	fetch GENERATION_DHAKA   into N;
        exit when GENERATION_DHAKA  %NOTFOUND;
		delete_GENERATION_DHAKA  (N.TRANSMETER_ID  );
	end loop;
	close GENERATION_DHAKA  ;
	
end;

/
-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_GENERATION_KHULNA
-----------------------------------------------------------------------------------------

create or replace procedure delete_GENERATION_KHULNA  (GNUM  IN NUMBER) as
cursor GENERATION_KHULNA  is select * from GENERATION_KHULNA   where TRANSMETER_ID= GNUM;
N GENERATION_KHULNA%ROWTYPE;

begin
	open GENERATION_KHULNA  ;
	loop
	fetch GENERATION_KHULNA   into N;
        exit when GENERATION_KHULNA  %NOTFOUND;
		delete_GENERATION_KHULNA  (N.TRANSMETER_ID  );
	end loop;
	close GENERATION_KHULNA  ;
	
end;

/



-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_GENERATION_RAUJAN
-----------------------------------------------------------------------------------------

create or replace procedure delete_GENERATION_RAUJAN  (GNUM  IN NUMBER) as
cursor GENERATION_RAUJAN  is select * from GENERATION_RAUJAN   where TRANSMETER_ID= GNUM;
N GENERATION_RAUJAN%ROWTYPE;

begin
	open GENERATION_RAUJAN  ;
	loop
	fetch GENERATION_RAUJAN   into N;
        exit when GENERATION_RAUJAN%NOTFOUND;
		delete_GENERATION_RAUJAN  (N.TRANSMETER_ID  );
	end loop;
	close GENERATION_RAUJAN  ;
	
end;

/
-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_GENERATION_GRASHAL
-----------------------------------------------------------------------------------------

create or replace procedure delete_GENERATION_GRASHAL  (GNUM  IN NUMBER) as
cursor GENERATION_GRASHAL  is select * from GENERATION_GRASHAL   where TRANSMETER_ID= GNUM;
N GENERATION_GRASHAL%ROWTYPE;

begin
	open GENERATION_GRASHAL  ;
	loop
	fetch GENERATION_GRASHAL   into N;
        exit when GENERATION_GRASHAL%NOTFOUND;
		delete_GENERATION_GRASHAL  (N.TRANSMETER_ID  );
	end loop;
	close GENERATION_GRASHAL  ;
	
end;

/








-----------------------------------------------------------------------------------------
--		PROCEDURE  DELETE_GENERATION_SHIDDERGANJ
-----------------------------------------------------------------------------------------

create or replace procedure delete_GENERATION_SHIDDERGANJ  (GNUM  IN NUMBER) as
cursor GENERATION_SHIDDERGANJ  is select * from GENERATION_SHIDDERGANJ   where TRANSMETER_ID= GNUM;
N GENERATION_SHIDDERGANJ%ROWTYPE;

begin
	open GENERATION_SHIDDERGANJ  ;
	loop
	fetch GENERATION_SHIDDERGANJ   into N;
        exit when GENERATION_SHIDDERGANJ%NOTFOUND;
		delete_GENERATION_SHIDDERGANJ  (N.TRANSMETER_ID  );
	end loop;
	close GENERATION_SHIDDERGANJ  ;
	
end;


/


----------------------------------------------------------------------------------------
--		FUNCTION  DRAFT_FUNCTON
-----------------------------------------------------------------------------------------

create or replace FUNCTION insert_update_DRAFT(

        F_BDN                         IN              DRAFT.BDN_NUMBER%TYPE,
	F_NAME                        IN              DRAFT.NAME%TYPE,
 	F_TAKA                        IN 	      DRAFT.TAKA%TYPE,
        F_DATES                       IN              DRAFT.DATES%TYPE,
        F_ADDRESS                     IN              DRAFT.ADDRESS%TYPE
       

)   

        RETURN DRAFT.BDN_NUMBER%TYPE 
IS
	num	Number;
	g_BDN_NUMBER     DRAFT.BDN_NUMBER%TYPE;
	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_BDN_NUMBER) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(BDN_NUMBER),'0') INTO num
		from DRAFT;
	
		g_BDN_NUMBER := lpad(to_char(num+1),5,'0');
                     INSERT INTO DRAFT
                                    (BDN_NUMBER,
                                     NAME,
                                     TAKA,
                                     DATES,
                                     ADDRESS
				  
                                     ) values 
                                   

          
                                    (F_BDN_NUMBER,
                                     F_NAME,
                                     F_TAKA,
                                     F_DATES, 
                                     F_ADDRESS
                         
                                                                                                               
                                    );
	
	ELSE
	
          	g_BDN_NUMBER := BDN_NUMBER ;
	
    	      UPDATE DRAFT SET   

			             BDN_NUMBER                   =      F_BDN_NUMBER,
                                     NAME                         =      F_NAME,   
                                     TAKA                         =      F_TAKA, 
                                     DATES                        =      F_DATES,
                                     ADDRESS                      =      F_ADDRESS 
				    
                                   
                                        
 WHERE BDN_NUMBER = g_BDN_NUMBER; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_BDN_NUMBER;
END;
               
/     



----------------------------------------------------------------------------------------
--		FUNCTION  APPLY_FUNCTON
-----------------------------------------------------------------------------------------

create or replace FUNCTION insert_update_APPLY(

        F_FROM_NUMBER                        IN              APPLY.FROM_NUMBER%TYPE,
	F_NAME                               IN              APPLY.NAME%TYPE,
 	F_FATHER_NAME                        IN 	     APPLY.FATHER_NAME%TYPE,
        F_MOTHER_NAME                        IN              APPLY.MOTHER_NAME%TYPE,
        F_GENDER                             IN              APPLY.GENDER%TYPE,
        F_AGE                                IN              APPLY.AGE%TYPE,
        F_EDUCATION_QUALIFICATION            IN              APPLY.EDUCATION_QUALIFICATION%TYPE,
        F_CONTACT_NUMBER                     IN              APPLY.CONTACT_NUMBER%TYPE,
        F_BDN_NUMBER                         IN              APPLY.BDN_NUMBER%TYPE,
        F_EMAIL_ADDRESS                      IN              APPLY.EMAIL_ADDRESS%TYPE

)   

        RETURN APPLY.FROM_NUMBER%TYPE 
IS
	num	Number;
	g_FROM_NUMBER    APPLY.FROM_NUMBER%TYPE;
	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_FROM_NUMBER) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(FROM_NUMBER),'0') INTO num
		from APPLY;
	
		g_FROM_NUMBER := lpad(to_char(num+1),10,'0');
                     INSERT INTO APPLY
                                    (FROM_NUMBER,
                                     NAME,
                                     FATHER_NAME,
                                     MOTHER_NAME,
                                     GENDER,
				     AGE,
				     EDUCATION_QUALIFICATION,
                                     CONTACT_NUMBER,
                                     BDN_NUMBER,
                                     EMAIL_ADDRESS
                                     ) values 
                                             
                                    (F_FROM_NUMBER,
                                     F_NAME,
                                     F_FATHER_NAME,
                                     F_MOTHER_NAME,
                                     F_GENDER,
				     F_AGE,
				     F_EDUCATION_QUALIFICATION,
                                     F_CONTACT_NUMBER,
                                     F_BDN_NUMBER,
                                     F_EMAIL_ADDRESS

                                                                                                                 
                                    );
	
	ELSE
	
          	g_FROM_NUMBER := F_FROM_NUMBER ;
	
    	      UPDATE APPLY SET   

			             FROM_NUMBER                  =      F_FROM_NUMBER,
                                     NAME                         =      F_NAME,   
                                     FATHER_NAME                  =      F_FATHER_NAME, 
                                     MOTHER_NAME                  =      F_MOTHER_NAME,
                                     GENDER                       =      F_GENDER, 
				     AGE                          =      F_AGE, 
				     EDUCATION_QUALIFICATION      =      F_EDUCATION_QUALIFICATION,
                                     CONTACT_NUMBER               =      F_CONTACT_NUMBER,
                                     BDN_NUMBER                   =      F_BDN_NUMBER,
                                     EMAIL_ADDRESS                =      F_EMAIL_ADDRESS
                                   
                                        
 WHERE FROM_NUMBER = g_FROM_NUMBER; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_FROM_NUMBER;
END;
               
/     


----------------------------------------------------------------------------------------
--		FUNCTION  HR_FUNCTON
-----------------------------------------------------------------------------------------

create or replace FUNCTION insert_update_HR(
        F_ID                                     IN              HR.ID%TYPE,
	F_DESIGNATION                            IN              HR.DESIGNATION%TYPE,
	F_NAME                                   IN              HR.NAME%TYPE,
 	F_FATHER_NAME                            IN 	         HR.FATHER_NAME%TYPE,
	F_MOTHER_NAME                            IN              HR.MOTHER_NAME%TYPE,
        F_GENDER                                 IN              HR.GENDER%TYPE,
        F_AGE                                    IN              HR.AGE%TYPE,
        F_DATE_OF_BIRTH                          IN              HR.DATE_OF_BIRTH%TYPE,
        F_CONTACT_NUMBER                         IN              HR.CONTACT_NUMBER%TYPE,
        F_E_MAIL_ID                              IN              HR.E_MAIL_ID%TYPE, 
        F_EDUCATION_BACKGROUND                   IN              HR.EDUCATION_BACKGROUND%TYPE,
        F_JOINING_DATE                           IN              HR.JOINING_DATE%TYPE,
        F_PRESENT_ADDRESS                        IN              HR.PRESENT_ADDRESS%TYPE,
        F_PERMANENT_ADDRESS                      IN              HR.PERMANENT_ADDRESS%TYPE
    
)

        RETURN HR.ID%TYPE 
IS
	num	Number;
	g_ID    HR.ID%TYPE;
	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_ID) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(ID),'0') INTO num
		from HR;
	
		g_ID := lpad(to_char(num+1),10,'0');
                     INSERT INTO HR (ID,
                                     DESIGNATION,
                                     NAME,
                                     FATHER_NAME,
                                     MOTHER_NAME,
                                     GENDER,
				     AGE,
				     DATE_OF_BIRTH,
				     CONTACT_NUMBER,
				     E_MAIL_ID,
                                     EDUCATION_BACKGROUND,
				     JOINING_DATE,
                                     PRESENT_ADDRESS,
                                     PERMANENT_ADDRESS   )values 
                                             
                                              (F_ID,
                                               F_DESIGNATION,
                                               F_NAME,
					       F_FATHER_NAME,
					       F_MOTHER_NAME,
                                               F_GENDER,
					       F_AGE,
					       F_DATE_OF_BIRTH,
					       F_CONTACT_NUMBER,
					       F_E_MAIL_ID,
					       F_EDUCATION_BACKGROUND,
					       F_JOINING_DATE,
					       F_PRESENT_ADDRESS,
					       F_PERMANENT_ADDRESS        
                                                    
                                           );
	
	ELSE
	
          	g_ID := F_ID ;
	
    	      UPDATE HR SET          
                                     ID					=   F_ID,
                                     DESIGNATION			=   F_DESIGNATION,
                                     NAME				=   F_NAME,
                                     FATHER_NAME			=   F_FATHER_NAME,
                                     MOTHER_NAME			=   F_MOTHER_NAME,
                                     GENDER				=   F_GENDER,
				     AGE				=   F_AGE,
				     DATE_OF_BIRTH			=   F_DATE_OF_BIRTH,
				     CONTACT_NUMBER			=   F_CONTACT_NUMBER,
				     E_MAIL_ID				=   F_E_MAIL_ID,
                                     EDUCATION_BACKGROUND		=   F_EDUCATION_BACKGROUND,
				     JOINING_DATE			=   F_JOINING_DATE,
                                     PRESENT_ADDRESS			=   F_PRESENT_ADDRESS,
                                     PERMANENT_ADDRESS   		=   F_PERMANENT_ADDRESS   

                                        
 WHERE ID = g_ID; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_ID;
END;


/

-----------------------------------------------------------------------------------------
--		FUNCTION  ADMIN_FUNCTON
-----------------------------------------------------------------------------------------

create or replace FUNCTION insert_update_ADMIN(
        F_ID                                     IN              ADMIN.ID%TYPE,
	F_DESIGNATION                            IN              ADMIN.DESIGNATION%TYPE,
 	F_EMPLOYEE_NAME                          IN 	         ADMIN.EMPLOYEE_NAME%TYPE,
        F_INCREMENTS                             IN              ADMIN.INCREMENTS%TYPE,
        F_DECREMENTS                             IN              ADMIN.DECREMENTS%TYPE,
        F_ACR                                    IN              ADMIN.ACR%TYPE,
        F_YEAR                                   IN              ADMIN.YEAR%TYPE
    
)

        RETURN ADMIN.ID%TYPE 
IS
	num	Number;
	g_ID    ADMIN.ID%TYPE;
	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_ID) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(ID),'0') INTO num
		from ADMIN;
	
		g_ID := lpad(to_char(num+1),10,'0');
                     INSERT INTO ADMIN 
                                    (ID,
                                     DESIGNATION,
                                     EMPLOYEE_NAME,
                                     INCREMENTS,
                                     DECREMENTS,
				     ACR,
				     YEAR
                                     ) values 
                                             
                                              (F_ID,
                                               F_DESIGNATION,
					       F_EMPLOYEE_NAME,
					       F_INCREMENTS,
                                               F_DECREMENTS,
					       F_ACR,
                                               F_YEAR

                                                                                                                 
                                    );
	
	ELSE
	
          	g_ID := F_ID ;
	
    	      UPDATE ADMIN SET          
                                     ID		                 =   F_ID,
                                     DESIGNATION		 =   F_DESIGNATION,
                                     EMPLOYEE_NAME	         =   F_EMPLOYEE_NAME,
                                     INCREMENTS			 =   F_INCREMENTS,
                                     DECREMENTS			 =   F_DECREMENTS,
				     ACR			 =   F_ACR,
		                     YEAR                        =   F_YEAR	 
				     
                                        
 WHERE ID = g_ID; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_ID;
END;
               
/     


-----------------------------------------------------------------------------------------
--		FUNCTION  SALARY_FUNCTON
-----------------------------------------------------------------------------------------

create or replace FUNCTION insert_update_SALARY(
       
	F_ID                                     IN              SALARY.ID%TYPE,
 	F_DESIGNATION                            IN 	         SALARY.DESIGNATION%TYPE,
        F_ACCOUNT_NUMBER                         IN              SALARY.ACCOUNT_NUMBER%TYPE,
        F_NAME_OF_MONTH                          IN              SALARY.NAME_OF_MONTH%TYPE,
        F_NAME_OF_YEAR                           IN              SALARY.NAME_OF_YEAR%TYPE,   
        F_CLEARANCE                              IN              SALARY.CLEARANCE%TYPE
    
)

        RETURN SALARY.ID%TYPE 
IS
	num	Number;
	g_ID    SALARY.ID%TYPE;
	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_ID) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(ID),'0') INTO num
		from SALARY;
	
		g_ID := lpad(to_char(num+1),10,'0');
                     INSERT INTO SALARY 
                                    (
                                    
                                     ID,
                                     DESIGNATION,
                                     ACCOUNT_NUMBER,
                                     NAME_OF_MONTH,
                                     NAME_OF_YEAR,
				     CLEARANCE                                                                        
                                     ) values 
                                             
                                              (
                                               F_ID,
                                               F_DESIGNATION,
					       F_ACCOUNT_NUMBER,
					       F_NAME_OF_MONTH,
					       F_NAME_OF_YEAR,
                                               F_CLEARANCE                                    

                                                                                                                 
                                    );
	
	ELSE
	
          	g_ID:= F_ID ;
	
    	      UPDATE SALARY SET          
                                     
                                     ID		                 =   F_ID,
                                     DESIGNATION		 =   F_DESIGNATION,
                                     ACCOUNT_NUMBER              =   F_ACCOUNT_NUMBER,
                                     NAME_OF_MONTH	         =   F_NAME_OF_MONTH,
                                     NAME_OF_YEAR	         =   F_NAME_OF_YEAR,
				     CLEARANCE                   =   F_CLEARANCE                                     
				     
                                        
 WHERE ID = g_ID; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_ID;
END;
               
/       
----------------------------------------------------------------------------------------
--		FUNCTION  ACCOUNT_FUNCTON
-----------------------------------------------------------------------------------------

create or replace FUNCTION insert_update_ACCOUNT(
        F_ID                                     IN              ACCOUNT.ID%TYPE,
	F_BASIC_SALARY                           IN              ACCOUNT.BASIC_SALARY%TYPE,
 	F_HOUSE_RENT                             IN 	         ACCOUNT.HOUSE_RENT%TYPE,
        F_BONUS                                  IN              ACCOUNT.BONUS%TYPE,
        F_INCREMENTS                             IN              ACCOUNT.INCREMENTS%TYPE,
        F_OTHER_ALLOUNCE                         IN              ACCOUNT.OTHER_ALLOUNCE%TYPE,
        F_MDICAL                                 IN              ACCOUNT.MEDICAL%TYPE,
        F_PHONE                                  IN              ACCOUNT.PHONE%TYPE,   
	F_TOTAL_AMOUNT                           IN              ACCOUNT.TOTAL_AMOUNT%TYPE,
	F_PAY_AMOUNT                             IN              ACCOUNT.PAY_AMOUNT%TYPE,    
        F_DUE_AMOUNT                             IN              ACCOUNT.DUE_AMOUNT%TYPE, 
	F_NAME_OF_MONTH                          IN              ACCOUNT.NAME_OF_MONTH%TYPE,
	F_NAME_OF_YEAR                           IN              ACCOUNT.NAME_OF_YEAR%TYPE
    
)

        RETURN ACCOUNT.ID%TYPE 
IS
	num	Number;
	g_ID    ACCOUNT.ID%TYPE;
	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_ID) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(ID),'0') INTO num
		from ACCOUNT;
	
		g_ID := lpad(to_char(num+1),10,'0');
                     INSERT INTO ACCOUNT
                                    (ID,
                                     BASIC_SALARY,
                                     HOUSE_RENT,
                                     BONUS,
                                     INCREMENTS,
				     OTHER_ALLOUNCE,
				     MEDICAL,
				     PHONE,
				     TOTAL_AMOUNT,
				     PAY_AMOUNT,
				     DUE_AMOUNT,
			             NAME_OF_MONTH,
				     NAME_OF_YEAR		
                                     ) values 
                                             
                                     (    F_ID, 
                                          F_BASIC_SALARY,                      
 	                                  F_HOUSE_RENT,
                                          F_BONUS,
                                          F_INCREMENTS,
                                          F_OTHER_ALLOUNCE,
                                          F_MDICAL,
                                          F_PHONE,   
	                                  F_TOTAL_AMOUNT,
	                                  F_PAY_AMOUNT,    
                                          F_DUE_AMOUNT, 
	                                  F_NAME_OF_MONTH,
	                                  F_NAME_OF_YEAR    

                                                                                                                 
                                    );
	
	ELSE
	
          	g_ID := F_ID ;
	
    	      UPDATE ACCOUNT SET          
                                     ID                       =     F_ID,
                                     BASIC_SALARY             =     F_BASIC_SALARY,
                                     HOUSE_RENT               =     F_HOUSE_RENT,
                                     BONUS                    =     F_BONUS,
                                     INCREMENTS		      =     F_INCREMENTS,
				     OTHER_ALLOUNCE           =     OTHER_ALLOUNCE,
				     MEDICAL                  =     MEDICAL,
				     PHONE                    =     PHONE,
				     TOTAL_AMOUNT             =     TOTAL_AMOUNT,
				     PAY_AMOUNT               =     PAY_AMOUNT,
				     DUE_AMOUNT               =     DUE_AMOUNT,
			             NAME_OF_MONTH            =     NAME_OF_MONTH,
				     NAME_OF_YEAR	      =     NAME_OF_YEAR
				      
                                        
 WHERE ID = g_ID; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_ID;
END;
               
/     


----------------------------------------------------------------------------------------
--		FUNCTION  BILLING_FUNCTON
-----------------------------------------------------------------------------------------

create or replace FUNCTION insert_update_BILLING(
      
        F_METER_ID                               IN              BILLING.METER_ID%TYPE,
	F_CUSTOMER_NAME                          IN              BILLING.CUSTOMER_NAME%TYPE,
 	F_CONTACT_NUMBER                         IN 	         BILLING.CONTACT_NUMBER%TYPE,
        F_AREA_ZONE                              IN              BILLING.AREA_ZONE%TYPE,
        F_TARIFF_CATEGORY                        IN              BILLING.TARIFF_CATEGORY%TYPE,
        F_USING_WATT                             IN              BILLING.USING_WATT%TYPE,
        F_NAME_OF_MONTH                          IN              BILLING.NAME_OF_MONTH%TYPE,
        F_NAME_OF_YEAR                           IN              BILLING.NAME_OF_YEAR%TYPE, 
	F_TOTAL_AMOUNT                           IN              BILLING.TOTAL_AMOUNT%TYPE
        
)

        RETURN BILLING.METER_ID%TYPE 
IS
	num	Number;
	g_METER_ID    BILLING.METER_ID%TYPE;
	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_METER_ID) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(METER_ID),'0') INTO num
		from BILLING;
	
		g_METER_ID := lpad(to_char(num+1),10,'0');
                     INSERT INTO BILLING
                                    
                                     (METER_ID,
                                     CUSTOMER_NAME,
                                     CONTACT_NUMBER,
                                     AREA_ZONE,
                                     TARIFF_CATEGORY,
				     USING_WATT,
				     NAME_OF_MONTH,
                                     NAME_OF_YEAR,
                                     TOTAL_AMOUNT
       
                                     ) values 
                                             
                                              (F_METER_ID,
                                               F_CUSTOMER_NAME,
					       F_CONTACT_NUMBER,
					       F_AREA_ZONE,
                                               F_TARIFF_CATEGORY,
					       F_USING_WATT,
					       F_NAME_OF_MONTH,
					       F_NAME_OF_YEAR,
                                               F_TOTAL_AMOUNT

                                                                                                                 
                                    );
	
	ELSE
	
          	g_METER_ID := F_METER_ID ;
	
    	      UPDATE BILLING SET          
                                     METER_ID		         =   F_METER_ID,
                                     CUSTOMER_NAME		 =   F_CUSTOMER_NAME,
                                     CONTACT_NUMBER	         =   F_CONTACT_NUMBER,
                                     AREA_ZONE			 =   F_AREA_ZONE,
                                     TARIFF_CATEGORY	         =   F_TARIFF_CATEGORY,
				     USING_WATT	                 =   F_USING_WATT,
		                     NAME_OF_MONTH               =   F_NAME_OF_MONTH,
                                     NAME_OF_YEAR                =   F_NAME_OF_YEAR,
                                     TOTAL_AMOUNT                =   F_TOTAL_AMOUNT
                                      
				     
                                        
 WHERE METER_ID = g_METER_ID; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_METER_ID;
END;

/















-----------------------------------------------------------------------------------------
--		FUNCTION  DISTRIBUTION_FUNCTON
-----------------------------------------------------------------------------------------



       
       	
       	
	create or replace FUNCTION insert_update_DISTRIBUTION(
      
        F_DISTRIBUTION_NUMBER                  IN              DISTRIBUTION.DISTRIBUTION_NUMBER %TYPE,
	F_COMPANY_NAME                         IN              DISTRIBUTION.COMPANY_NAME%TYPE,
 	F_DIVISION_NAME                        IN 	       DISTRIBUTION.DIVISION_NAME%TYPE,
        F_DISTRICT_NAME                        IN              DISTRIBUTION.DISTRICT_NAME%TYPE,
        F_AREA_ZONE                            IN              DISTRIBUTION.AREA_ZONE%TYPE,
        F_TOTAL_POWER_AMOUNT                   IN              DISTRIBUTION.TOTAL_POWER_AMOUNT%TYPE,
        F_DEMAND_POWER_AMOUNT                  IN              DISTRIBUTION.DEMAND_POWER_AMOUNT%TYPE,
        F_LOAD_SHEADING                        IN              DISTRIBUTION.LOAD_SHEADING%TYPE

        
)

        RETURN DISTRIBUTION.DISTRIBUTION_NUMBER %TYPE 
IS
	num	Number;
	g_DISTRIBUTION_NUMBER     DISTRIBUTION.DISTRIBUTION_NUMBER %TYPE;
	

	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_DISTRIBUTION_NUMBER ) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(DISTRIBUTION_NUMBER ),'0') INTO num
		from DISTRIBUTION;
	
		g_DISTRIBUTION_NUMBER  := lpad(to_char(num+1),10,'0');
                     INSERT INTO DISTRIBUTION
                                    
                                    (DISTRIBUTION_NUMBER,
                                     COMPANY_NAME ,
                                     DIVISION_NAME,
                                     DISTRICT_NAME,
                                     AREA_ZONE,
				     TOTAL_POWER_AMOUNT,
				     DEMAND_POWER_AMOUNT,
                                     LOAD_SHEADING
                         
       
                                     ) values 
                                             
                                              (F_DISTRIBUTION_NUMBER,
                                               F_COMPANY_NAME,
					       F_DIVISION_NAME,
					       F_DISTRICT_NAME,
                                               F_AREA_ZONE,
					       F_TOTAL_POWER_AMOUNT,
					       F_DEMAND_POWER_AMOUNT,
                                               F_LOAD_SHEADING

                                                                                                                 
                                    );
	
	ELSE
	
          	g_DISTRIBUTION_NUMBER  := F_DISTRIBUTION_NUMBER  ;
	
    	      UPDATE DISTRIBUTION SET          
                                     

        DISTRIBUTION_NUMBER                  =   F_DISTRIBUTION_NUMBER ,
	COMPANY_NAME                         =   F_COMPANY_NAME,
 	DIVISION_NAME                        =   F_DIVISION_NAME,
        DISTRICT_NAME                        =   F_DISTRICT_NAME,
        AREA_ZONE                            =   F_AREA_ZONE,
        TOTAL_POWER_AMOUNT                   =   F_TOTAL_POWER_AMOUNT,
        DEMAND_POWER_AMOUNT                  =   F_DEMAND_POWER_AMOUNT,
        LOAD_SHEADING                        =   F_LOAD_SHEADING
				     
                                        
 WHERE DISTRIBUTION_NUMBER  = g_DISTRIBUTION_NUMBER ; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_DISTRIBUTION_NUMBER ;
END;


/




----------------------------------------------------------------------------------------
--		FUNCTION  GENERATION_KHULNA_FUNCTON
-----------------------------------------------------------------------------------------

create or replace FUNCTION insert_update_GENERATION_KHULNA(
      
        F_TRANSMETER_ID                  IN    GENERATION_KHULNA.TRANSMETER_ID%TYPE,
	F_COMPANY_NAME                   IN    GENERATION_KHULNA.COMPANY_NAME%TYPE,
 	F_NAME_OF_MONTH                  IN    GENERATION_KHULNA.NAME_OF_MONTH%TYPE,
        F_NAME_OF_YEAR                   IN    GENERATION_KHULNA.NAME_OF_YEAR%TYPE,
        F_BUDGETING_AMOUNT               IN    GENERATION_KHULNA.BUDGETING_AMOUNT%TYPE,
        F_TARGET_POWER_AMOUNT            IN    GENERATION_KHULNA.TARGET_POWER_AMOUNT%TYPE,
        F_POWER_SYSTEM_LOSS              IN    GENERATION_KHULNA.POWER_SYSTEM_LOSS%TYPE,
        F_USABLE_POWER_AMOUNT            IN    GENERATION_KHULNA.USABLE_POWER_AMOUNT%TYPE, 
        F_TOTAL_BALENCE_AMOUNT           IN    GENERATION_KHULNA.TOTAL_BALENCE_AMOUNT%TYPE,
        F_SERIAL_NUMBER                  IN    GENERATION_KHULNA.SERIAL_NUMBER%TYPE            
        
)

        RETURN GENERATION_KHULNA.TRANSMETER_ID%TYPE 
IS
	num	Number;
	g_TRANSMETER_ID    GENERATION_KHULNA.TRANSMETER_ID%TYPE;
	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_TRANSMETER_ID) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(TRANSMETER_ID),'0') INTO num
		from GENERATION_KHULNA;
	
		g_TRANSMETER_ID := lpad(to_char(num+1),10,'0');
                     INSERT INTO GENERATION_KHULNA
                                    
                                    (TRANSMETER_ID ,
                                     COMPANY_NAME ,
                                     NAME_OF_MONTH,
                                     NAME_OF_YEAR,
                                     BUDGETING_AMOUNT,
				     TARGET_POWER_AMOUNT,
				     POWER_SYSTEM_LOSS,
                                     USABLE_POWER_AMOUNT,
			             TOTAL_BALENCE_AMOUNT ,
                                     SERIAL_NUMBER

                         
       
                                     ) values 
                                             
                                    (F_TRANSMETER_ID ,
                                     F_COMPANY_NAME ,
                                     F_NAME_OF_MONTH,
                                     F_NAME_OF_YEAR,
                                     F_BUDGETING_AMOUNT,
				     F_TARGET_POWER_AMOUNT,
				     F_POWER_SYSTEM_LOSS,
                                     F_USABLE_POWER_AMOUNT,
			             F_TOTAL_BALENCE_AMOUNT,
                                     F_SERIAL_NUMBER

                                                                                                                 
                                    );
	
	ELSE
	
          	g_TRANSMETER_ID := F_TRANSMETER_ID ;
	
    	      UPDATE GENERATION_KHULNA SET          
                                     

        TRANSMETER_ID                  =    F_TRANSMETER_ID,
	COMPANY_NAME                   =    F_COMPANY_NAME,
 	NAME_OF_MONTH                  =    F_NAME_OF_MONTH,
        NAME_OF_YEAR                   =    F_NAME_OF_YEAR,
        BUDGETING_AMOUNT               =    F_BUDGETING_AMOUNT,
        TARGET_POWER_AMOUNT            =    F_TARGET_POWER_AMOUNT,
        POWER_SYSTEM_LOSS              =    F_POWER_SYSTEM_LOSS,
        USABLE_POWER_AMOUNT            =    F_USABLE_POWER_AMOUNT, 
        TOTAL_BALENCE_AMOUNT           =    F_TOTAL_BALENCE_AMOUNT ,
        SERIAL_NUMBER                  =    F_SERIAL_NUMBER            
        
				     
                                        
 WHERE TRANSMETER_ID = g_TRANSMETER_ID; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_TRANSMETER_ID;
END;

/








----------------------------------------------------------------------------------------
--		FUNCTION  GENERATION_SHIDDERGANJ_FUNCTON
-----------------------------------------------------------------------------------------

create or replace FUNCTION insert_update_GENERATION_SHIDDERGANJ(
      
        F_TRANSMETER_ID                  IN    GENERATION_SHIDDERGANJ.TRANSMETER_ID%TYPE,
	F_COMPANY_NAME                   IN    GENERATION_SHIDDERGANJ.COMPANY_NAME%TYPE,
 	F_NAME_OF_MONTH                  IN    GENERATION_SHIDDERGANJ.NAME_OF_MONTH%TYPE,
        F_NAME_OF_YEAR                   IN    GENERATION_SHIDDERGANJ.NAME_OF_YEAR%TYPE,
        F_BUDGETING_AMOUNT               IN    GENERATION_SHIDDERGANJ.BUDGETING_AMOUNT%TYPE,
        F_TARGET_POWER_AMOUNT            IN    GENERATION_SHIDDERGANJ.TARGET_POWER_AMOUNT%TYPE,
        F_POWER_SYSTEM_LOSS              IN    GENERATION_SHIDDERGANJ.POWER_SYSTEM_LOSS%TYPE,
        F_USABLE_POWER_AMOUNT            IN    GENERATION_SHIDDERGANJ.USABLE_POWER_AMOUNT%TYPE, 
        F_TOTAL_BALENCE_AMOUNT           IN    GENERATION_SHIDDERGANJ.TOTAL_BALENCE_AMOUNT%TYPE,
        F_SERIAL_NUMBER                  IN    GENERATION_SHIDDERGANJ.SERIAL_NUMBER%TYPE            
        
)

        RETURN GENERATION_SHIDDERGANJ.TRANSMETER_ID%TYPE 
IS
	num	Number;
	g_TRANSMETER_ID    GENERATION_SHIDDERGANJ.TRANSMETER_ID%TYPE;
	

BEGIN	

       
       	
       	
	IF TO_NUMBER(F_TRANSMETER_ID) = 0 
	THEN
	
    	
		
	      SELECT nvl(max(TRANSMETER_ID),'0') INTO num
		from GENERATION_SHIDDERGANJ;
	
		g_TRANSMETER_ID := lpad(to_char(num+1),10,'0');
                     INSERT INTO GENERATION_SHIDDERGANJ
                                    
                                    (TRANSMETER_ID ,
                                     COMPANY_NAME ,
                                     NAME_OF_MONTH,
                                     NAME_OF_YEAR,
                                     BUDGETING_AMOUNT,
				     TARGET_POWER_AMOUNT,
				     POWER_SYSTEM_LOSS,
                                     USABLE_POWER_AMOUNT,
			             TOTAL_BALENCE_AMOUNT ,
                                     SERIAL_NUMBER

                         
       
                                     ) values 
                                             
                                    (F_TRANSMETER_ID ,
                                     F_COMPANY_NAME ,
                                     F_NAME_OF_MONTH,
                                     F_NAME_OF_YEAR,
                                     F_BUDGETING_AMOUNT,
				     F_TARGET_POWER_AMOUNT,
				     F_POWER_SYSTEM_LOSS,
                                     F_USABLE_POWER_AMOUNT,
			             F_TOTAL_BALENCE_AMOUNT,
                                     F_SERIAL_NUMBER

                                                                                                                 
                                    );
	
	ELSE
	
          	g_TRANSMETER_ID := F_TRANSMETER_ID ;
	
    	      UPDATE GENERATION_SHIDDERGANJ SET          
                                     

        TRANSMETER_ID                  =    F_TRANSMETER_ID,
	COMPANY_NAME                   =    F_COMPANY_NAME,
 	NAME_OF_MONTH                  =    F_NAME_OF_MONTH,
        NAME_OF_YEAR                   =    F_NAME_OF_YEAR,
        BUDGETING_AMOUNT               =    F_BUDGETING_AMOUNT,
        TARGET_POWER_AMOUNT            =    F_TARGET_POWER_AMOUNT,
        POWER_SYSTEM_LOSS              =    F_POWER_SYSTEM_LOSS,
        USABLE_POWER_AMOUNT            =    F_USABLE_POWER_AMOUNT, 
        TOTAL_BALENCE_AMOUNT           =    F_TOTAL_BALENCE_AMOUNT ,
        SERIAL_NUMBER                  =    F_SERIAL_NUMBER            
        
				     
                                        
 WHERE TRANSMETER_ID = g_TRANSMETER_ID; 
	      
	      
      END IF;
	
	COMMIT;
	RETURN g_TRANSMETER_ID;
END;

/

----------------------------------------------------------------------
--			FOR ALL ROW
----------------------------------------------------------------------

DECLARE 

        v_usr usr%rowtype;
   CURSOR         c_usr IS 
   SELECT *
   FROM     usr;

BEGIN
 
 OPEN        c_usr; 
   LOOP
    FETCH    c_usr INTO v_usr; 
    EXIT     WHEN c_usr%NOTFOUND;
              DBMS_OUTPUT.PUT_LINE (v_usr.ID|| ' ' || v_usr.NAME||' '||v_usr.DESIG||' '||v_usr.FULL_NAME); 
   END LOOP;
 CLOSE        c_usr; 
   IF         c_usr%ISOPEN = FALSE
     THEN
              DBMS_OUTPUT.PUT_LINE('Cursor closed');
   ELSE
              DBMS_OUTPUT.PUT_LINE('The cursor is still open');
   END IF;
 END; 

/

 


     