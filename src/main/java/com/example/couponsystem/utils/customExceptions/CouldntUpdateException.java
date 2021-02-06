package com.example.couponsystem.utils.customExceptions;

public class CouldntUpdateException extends Exception
{
    public CouldntUpdateException(String whereIsTheIssue)
    {
        super("You can't change the field:  " + whereIsTheIssue);
    }
}
