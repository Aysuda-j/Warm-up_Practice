# include <stdio.h>
# include <string.h>
# include <stdbool.h>

int main(){

    char word [50];
    printf("Enter Your Word: ");

    fgets(word, sizeof(word),stdin);
    word[strcspn(word, "\n")] = '\0';
    
    bool palindrome = true;
    
    for(int i=0,j=strlen(word)-1 ; i<j ; i++,j--){
        
        if(word[i] != word[j]){
            palindrome = false; break;
        }
    }
    
    if(!palindrome){
            printf("Is Not A Palindrome!\n");
        }
    else {printf("It Is A Palindrome.\n");}

    for(int i=0 ; i<strlen(word) ; i++){
        printf("%-5c", word[i]);
    }

    printf("\n");

    for(int j=strlen(word)-1 ; j>=0 ; j--){
        printf("%-5c", word[j]);
    }

    return 0;
}
