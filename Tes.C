#include <stdio.h>

int main(void)
{
    int baseInt;
    int headInt;

    scanf("%d", &baseInt);
    scanf("%d", &headInt);

    printf("    %d\n", headInt);
    printf("    %d%d\n", headInt, headInt);

    for (int k = 1; k <= 3; k++)
    {
        if (k == 1 || k == 3)
        {
            for (int i = 1; i <= 7; i++)
            {
                if (i >= 5)
                {
                    printf("%d", baseInt);
                }
                else
                {
                    printf("%d", headInt);
                }
                printf("\n");
            }
        }else{
                for (int i = 1; i <= 8; i++)
                {
                    if (i >= 5)
                    {
                        printf("%d", baseInt);
                    }
                    else
                    {
                        printf("%d", headInt);
                    }
                    printf("\n");
                }
            }
    }
        return 0;
    }
