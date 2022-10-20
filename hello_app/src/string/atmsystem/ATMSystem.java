package string.atmsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        // 建立集合用于存储Account
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        // 设置初始界面
        while (running) {
            System.out.println("================欢迎进入ATM管理系统=================");
            System.out.println("请根据数字选择要进行的操作：");
            System.out.println("1：登录账户");
            System.out.println("2：新账户开户");
            System.out.println("3：退出系统");
            int choice = sc.nextInt();
            //根据用户输入进行功能判断
            switch (choice){
                case 1:
                    login(accounts, sc);
                    break;
                case 2:
                    register(accounts, sc);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("您输入有误！请重新输入！");
            }
        }
        System.out.println("已成功退出系统！");
    }

    /**
     * 该方法用于实现注册功能
     * @param accounts 入参Account集合
     * @param sc
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("================欢迎进入新用户开户界面================");
        Account account = new Account();
        System.out.println("请输入您的姓名：");
        String userName = sc.next();
        account.setUserName(userName);
        boolean notChoose = true;
        while (notChoose){
            System.out.println("请选择您的性别：\n1.男\n2.女");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    account.setGender("男");
                    notChoose = false;
                    break;
                case 2:
                    account.setGender("女");
                    notChoose = false;
                    break;
                default:
                    System.out.println("您输入有误！请重试！");
                    break;
            }
        }
        while (true) {
            System.out.println("请输入要设置的账户密码：");
            String password = sc.next();
            System.out.println("请再次确认账户密码：");
            String okpassword = sc.next();
        // 进行密码确认
            if (password.equals(okpassword)){
                account.setPassword(password);
                break;
            }
            else{
                System.out.println("两次输入的密码不一致！请重新设置密码！");
            }
        }
        System.out.println("请设置单日取现额度：");
        double quota = sc.nextDouble();
        account.setQuota(quota);
        // 建立新卡号，独立方法处理
        String cardId = getRandomCardId(accounts);
        account.setCarId(cardId);
        // 添加该account到账户集合中
        accounts.add(account);
        // 告知用户账户已注册成功，并展示
        String gendercheck = account.getGender().equals("男")? "先生":"女士";
        System.out.println("尊敬的"+account.getUserName()+gendercheck+"您的新账户已注册成功！您的卡号是："+account.getCarId());

    }

    /**
     * 建立19位新卡号，不能与现有卡号重复，这里做简单遍历比对处理，
     * @param accounts 入参Account集合
     * @return
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random rd = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 19; i++) {
                cardId += rd.nextInt(10);
            }
            // 判断卡号是否重复
            Account acc = getAccountById(accounts, cardId);
            // 返回null说明该cardId不存在，也就是可用
            if (acc == null){
                return cardId;
            }
        }


    }

    /**
     * 根据CardId返回Account，如果不存在该cardId，则返回null
     * @param accounts
     * @param cardId
     * @return
     */
    private static Account getAccountById(ArrayList<Account> accounts, String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCarId().equals(cardId)){
                return acc;
            }
        }
        return null;
    }


    /**
     * 登录功能
     * @param accounts 账户集合
     * @param sc Scanner扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("===============ATM系统登陆界面===============");
        // 加一个小功能，判断当前系统中有无账户，如果没有，需要先开户
        if (accounts.size() == 0){
            System.out.println("当前系统中没有任何账户，请先开户，再来登录！");
            return;
        }
        // 正式进入登录操作
        while (true) {
            System.out.println("请输入您的卡号：");
            String presentCardId = sc.next();
            // getAccountById
            Account presentAccount = getAccountById(accounts, presentCardId);
            // 判断是否找到，没找到就继续找
            if (presentAccount != null){
                // 找到了，接着输入密码
                for (int i = 0; i < 5; i++) {
                    System.out.println("请输入您的密码：");
                    String presentPassword = sc.next();
                    // 输入对了就登录，错了再次输入，5次机会
                    if (presentAccount.getPassword().equals(presentPassword)){
                        String gendercheck = presentAccount.getGender().equals("男")? "先生":"女士";
                        System.out.println("尊敬的"+presentAccount.getUserName()+gendercheck+"，欢迎登录！");
                        showUserCommand(presentAccount, sc);
                        return;
                    }
                    else{
                        System.out.println("您输入的密码不正确！请重新输入！您还有"+(4-i)+"次机会！");
                        if (i == 4){
                            System.out.println("您的输入机会已使用完！退出登录界面！");
                            return;
                        }
                    }
                }
            }
            else{
                System.out.println("您输入的卡号不存在！请重新输入！");
        }
        }
    }

    /**
     * 展示登陆后的操作页面
     * @param presentAccount 当前账户
     * @param sc
     */
    private static void showUserCommand(Account presentAccount, Scanner sc) {
        while (true) {
            System.out.println("==============用户操作页================");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 查询账户
                    showAccount(presentAccount);
                    break;
                case 2:
                    // 存款
                    depositMoney(presentAccount, sc);
                    break;
                case 3:
                    // 取款
                    withdrawMoney(presentAccount, sc);
                    break;
                case 4:
                    // 转账
                    break;
                case 5:
                    // 修改密码
                    break;
                case 6:
                    // 退出
                    System.out.println("退出成功，欢迎下次光临！");
                    return;
                case 7:
                    // 注销账户
                    break;
                default:
                    System.out.println("您输入的操作命令不正确！");
            }
        }

    }

    /**
     * 取款功能，需要判断是否大于限额，是否大于余额
     * @param presentAccount
     * @param sc
     */
    private static void withdrawMoney(Account presentAccount, Scanner sc) {
        while (true) {
            System.out.println("==================用户取款操作===================");
            System.out.println("请输入取款数额：");
            double money = sc.nextDouble();
            if (money <= presentAccount.getQuota()) {
                if (money <= presentAccount.getBalance()) {
                    presentAccount.setBalance(presentAccount.getBalance() - money);
                    showAccount(presentAccount);
                    System.out.println("本次取款"+money+"元成功！");
                    return;
                } else {
                    System.out.println("余额不足！当前余额为" + presentAccount.getBalance() + "\n是否继续取款？\n1、是\n2、否");
                    int command = sc.nextInt();
                    switch (command) {
                        case 1:
                            break;
                        case 2:
                        default:
                            return;
                    }
                }
            }
            else {
                System.out.println("对不起，您当前取款金额超出每次限额！每次最多可取"+presentAccount.getQuota()+"\n是否继续取款？\n1、是\n2、否");
                int command = sc.nextInt();
                switch (command){
                    case 1:
                        break;
                    case 2:
                    default:
                        return;
                }
            }
        }
    }

    /**
     * 存款功能
     * @param presentAccount 当前账户
     * @param sc
     */
    private static void depositMoney(Account presentAccount, Scanner sc) {
        System.out.println("==================用户存款操作===================");
        System.out.println("请输入要存储的金额：");
        double deposit = sc.nextDouble();
        presentAccount.setBalance(presentAccount.getBalance()+deposit);
        System.out.println("您的存款操作已成功！");
        showAccount(presentAccount);

    }

    /**
     * 展示当前账户
     * @param presentAccount
     */
    private static void showAccount(Account presentAccount) {
        System.out.println("=================当前账户信息如下===================");
        System.out.println("卡号："+presentAccount.getCarId());
        System.out.println("户主："+presentAccount.getUserName());
        System.out.println("余额："+presentAccount.getBalance());
        System.out.println("限额："+presentAccount.getQuota());
    }
}
