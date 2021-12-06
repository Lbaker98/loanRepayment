{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww28600\viewh15440\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /*\
 * To change this license header, choose License Headers in Project Properties.\
 * To change this template file, choose Tools | Templates\
 * and open the template in the editor.\
 */\
package loan.repayment.v1;\
\
public class CurrentAccount \
\{\
    private float balance;\
    private static double interestRate = 0.0008;\
    float initialBalance;\
    float newBalance;\
    \
    public float getBalance(float balance)\
    \{\
        initialBalance = balance;\
        return initialBalance;\
    \}\
    public void addInterest(float initialBalance)\
    \{\
        float intrest = (float)interestRate;\
        newBalance = (intrest * initialBalance) + initialBalance;    \
    \}\
    public void makeDeposit(float deposit)\
    \{\
        initialBalance = newBalance;\
        initialBalance = initialBalance + deposit;\
    \}\
\}\
}