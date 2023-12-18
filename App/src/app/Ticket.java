package app;

interface ITickets {
    void TicketsType();
}

interface CreatorTickets {
    ITickets FactoryMethod();
}


class Ticket_R implements ITickets {
    @Override
    public void TicketsType(){
        System.out.println("R tickets");
    }
}

class Ticket_S implements ITickets {
    @Override
    public void TicketsType(){
        System.out.println("S tickets");
    }
}

class R implements CreatorTickets {
    @Override
    public ITickets FactoryMethod(){
        return new Ticket_R();
    }
}

class S implements CreatorTickets {
    @Override
    public ITickets FactoryMethod(){
        return new Ticket_S();
    }
}

