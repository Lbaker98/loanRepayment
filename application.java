{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 package loan.repayment.v1;\
\
import java.io.*;\
\
/**\
 *\
 * @author Louis\
 */\
public class Application \{\
\
    public static void main(String[] args) throws IOException \
    \{\
        InputStreamReader isr = new InputStreamReader(System.in);\
        BufferedReader br = new BufferedReader(isr);\
        \
        float jLoan = 20000;\
        float jIncome = 2000;\
        float jOutgoing = 1200;\
        float jLoanPayment = 200;\
        float jNet;\
        float jIntAm = 0;\
\
        float mLoan = 20000;\
        float mIncome = 2000;\
        float mOutgoing = 1000;\
        float mLoanPayment = 300;\
        float mNet;\
\
        //Initiating connection between classes for each users account\
        LoanAccount jLoanAcc = new LoanAccount();\
        CurrentAccount jCurAcc = new CurrentAccount();\
\
        LoanAccount mLoanAcc = new LoanAccount();\
        SavingsAccount mSavAcc = new SavingsAccount();\
\
        System.out.println();\
        \
        \
        //John\
        //Adding Loan amount to loan account initial balance.\
        //Calculating remainder oing into his current account subtracting the loan payment. Then updating the total.\
        jNet = jIncome - jOutgoing;\
        jNet = jNet - jLoanPayment;\
        float jcurbal = jCurAcc.getBalance(jNet);\
        float jCurBal2 = jLoanAcc.getBalance(jLoan);\
        float jRepayedAm = 0;\
            \
            \
        for (int i = 0; jRepayedAm < 30000; i++) \
        \{\
            jcurbal = jcurbal+jNet;\
            jCurAcc.addInterest(jcurbal);   \
            jCurAcc.makeDeposit(jcurbal);\
                \
            jLoanAcc.addInterest(jCurBal2);\
            jLoanAcc.makePayment(jRepayedAm);\
              \
            jRepayedAm = jRepayedAm + jLoanPayment ;\
                \
                if (jRepayedAm >= 20000) \
                \{\
                    System.out.println("John repaid her loan in " + i +" months. His current account balance is \'a3" + jcurbal);\
                    break;\
                \} \
            \}\
            \
            mNet = mIncome - mOutgoing;\
            mNet = mNet - mLoanPayment;\
            float mcurbal = mSavAcc.getBalance(mNet);\
            float mCurBal2 = mLoanAcc.getBalance(mLoan);\
            float mRepayedAm = 0;\
            \
            for (int i = 0; mRepayedAm < 30000; i++) \
            \{\
                mcurbal = mcurbal+mNet;\
                mSavAcc.addInterest(mcurbal);   \
                mSavAcc.makeDeposit(mcurbal);\
                \
                mLoanAcc.addInterest(mCurBal2);\
                mLoanAcc.makePayment(mRepayedAm);\
                \
                mRepayedAm = mRepayedAm + mLoanPayment ;\
                \
                if (mRepayedAm >= 20000) \
                \{\
                    System.out.println("Mary repaid her loan in " + i +" months. Her savings account balance is \'a3" + mcurbal);\
                    break;\
                \} \
            \}\
    \}\
\}\
}